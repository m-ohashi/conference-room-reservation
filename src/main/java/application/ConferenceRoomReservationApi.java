package application;

import conferenceRoom.datasource.ConferenceRoomRepositoryDb;
import conferenceRoom.domain.ConferenceRoomId;
import conferenceRoom.domain.ConferenceRoomUseDateTime;
import conferenceRoom.domain.ConferenceRoomUseFromDateTime;
import conferenceRoom.domain.ConferenceRoomUseToDateTime;
import javaslang.control.Validation;
import reservation.datasource.ConferenceRoomReservationRepositoryDb;
import reservation.domain.ReservationName;
import reservationResult.ResultNg;
import reservationResult.ResultOk;

import java.time.LocalDateTime;

public class ConferenceRoomReservationApi {
    public static void main(String[] args) {
        ConferenceRoomReservationService conferenceRoomReservationService
                = new ConferenceRoomReservationService(
                        new ConferenceRoomRepositoryDb(),
                        new ConferenceRoomReservationRepositoryDb()
        );

        Validation<ResultNg, ResultOk> result = conferenceRoomReservationService.reserve(
                new ConferenceRoomApplication(
                        new ConferenceRoomId(1),
                        new ReservationName("hoge"),
                        new ConferenceRoomUseDateTime(
                                new ConferenceRoomUseFromDateTime(LocalDateTime.of(2018, 10, 1, 13, 0, 0)),
                                new ConferenceRoomUseToDateTime(LocalDateTime.of(2018, 10, 1, 14, 0, 0))
                        )
                )
        );
        System.out.println(
                result.isValid() ?
                        result.get().toString()
                        : result.getError().display()
        );
    }
}
