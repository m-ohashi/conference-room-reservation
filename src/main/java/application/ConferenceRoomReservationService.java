package application;

import conferenceRoom.domain.ConferenceRoom;
import conferenceRoom.domain.ConferenceRoomRepository;
import javaslang.collection.List;
import javaslang.control.Option;
import javaslang.control.Validation;
import reservation.domain.ConferenceRoomReservation;
import reservation.domain.ConferenceRoomReservationRepository;
import reservationResult.DoubleBookingConferenceRoomApplication;
import reservationResult.NotExistConferenceRoom;
import reservationResult.ResultNg;
import reservationResult.ResultOk;

public class ConferenceRoomReservationService {
    private final ConferenceRoomRepository conferenceRoomRepository;
    private final ConferenceRoomReservationRepository conferenceRoomReservationRepository;

    public ConferenceRoomReservationService(
            ConferenceRoomRepository conferenceRoomRepository,
            ConferenceRoomReservationRepository conferenceRoomReservationRepository) {
        this.conferenceRoomRepository = conferenceRoomRepository;
        this.conferenceRoomReservationRepository = conferenceRoomReservationRepository;
    }

    public Validation<ResultNg, ResultOk> reserve(ConferenceRoomApplication conferenceRoomApplication) {

        Option<ConferenceRoom> conferenceRoom = conferenceRoomRepository.find(conferenceRoomApplication.getConferenceRoomId());
        // 会議室があるか
        if (conferenceRoom.isEmpty()) {
            return Validation.invalid(new NotExistConferenceRoom());
        }

        List<ConferenceRoomReservation> conferenceRoomReservationList
                = conferenceRoomReservationRepository
                .referConferenceRoomReservationList(conferenceRoomApplication.getConferenceRoomId())
                .filter(v -> v.isNotEmpty(conferenceRoomApplication.getConferenceRoomUseDateTime()));
        // 予約が重複していないか
        if (!conferenceRoomReservationList.isEmpty()) {
            return Validation.invalid(new DoubleBookingConferenceRoomApplication(
                    conferenceRoomReservationList,
                    conferenceRoom.get()
            ));
        }
        // 予約する
        conferenceRoomReservationRepository.reserve(
                conferenceRoomApplication.createConferenceRoomReservation(conferenceRoomReservationRepository.createReservationId())
        );

        return Validation.valid(new ResultOk(
                conferenceRoom.get().getConferenceRoomName(),
                conferenceRoomApplication.getConferenceRoomUseDateTime(),
                conferenceRoomApplication.getReservationName()
        ));
    }
}
