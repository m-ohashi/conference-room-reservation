package reservation.datasource;

import conferenceRoom.domain.ConferenceRoomId;
import conferenceRoom.domain.ConferenceRoomUseDateTime;
import conferenceRoom.domain.ConferenceRoomUseFromDateTime;
import conferenceRoom.domain.ConferenceRoomUseToDateTime;
import javaslang.collection.List;
import reservation.domain.ConferenceRoomReservation;
import reservation.domain.ConferenceRoomReservationRepository;
import reservation.domain.ReservationId;
import reservation.domain.ReservationName;

import java.time.LocalDateTime;

public class ConferenceRoomReservationRepositoryDb implements ConferenceRoomReservationRepository {
    @Override
    public List<ConferenceRoomReservation> referConferenceRoomReservationList(
            ConferenceRoomId conferenceRoomId) {
        return List.of(
                new ConferenceRoomReservation(
                        new ReservationId(1),
                        conferenceRoomId,
                        new ReservationName("aaa"),
                        new ConferenceRoomUseDateTime(
                                new ConferenceRoomUseFromDateTime(LocalDateTime.of(2018, 10, 1, 12, 0, 0)),
                                new ConferenceRoomUseToDateTime(LocalDateTime.of(2018, 10, 1, 13, 0, 0))
                        )
                ),
                new ConferenceRoomReservation(
                        new ReservationId(2),
                        conferenceRoomId,
                        new ReservationName("bbb"),
                        new ConferenceRoomUseDateTime(
                                new ConferenceRoomUseFromDateTime(LocalDateTime.of(2018, 10, 31, 12, 0, 0)),
                                new ConferenceRoomUseToDateTime(LocalDateTime.of(2018, 10, 31, 13, 0, 0))
                        )
                ),
                new ConferenceRoomReservation(
                        new ReservationId(3),
                        conferenceRoomId,
                        new ReservationName("ccc"),
                        new ConferenceRoomUseDateTime(
                                new ConferenceRoomUseFromDateTime(LocalDateTime.of(2018, 11, 1, 12, 0, 0)),
                                new ConferenceRoomUseToDateTime(LocalDateTime.of(2018, 11, 1, 13, 0, 0))
                        )
                )
        );
    }

    @Override
    public void reserve(ConferenceRoomReservation conferenceRoomReservation) {

    }

    @Override
    public ReservationId createReservationId() {
        return new ReservationId(4);
    }
}
