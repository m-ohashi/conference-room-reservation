package application;

import conferenceRoom.domain.ConferenceRoomId;
import conferenceRoom.domain.ConferenceRoomUseDateTime;
import reservation.domain.ConferenceRoomReservation;
import reservation.domain.ReservationId;
import reservation.domain.ReservationName;

public class ConferenceRoomApplication {
    private final ConferenceRoomId conferenceRoomId;
    private final ReservationName reservationName;
    private final ConferenceRoomUseDateTime conferenceRoomUseDateTime;

    public ConferenceRoomApplication(
            ConferenceRoomId conferenceRoomId,
            ReservationName reservationName,
            ConferenceRoomUseDateTime conferenceRoomUseDateTime) {
        this.conferenceRoomId = conferenceRoomId;
        this.reservationName = reservationName;
        this.conferenceRoomUseDateTime = conferenceRoomUseDateTime;
    }

    public ConferenceRoomReservation createConferenceRoomReservation(ReservationId reservationId) {
        return new ConferenceRoomReservation(
                reservationId,
                this.conferenceRoomId,
                this.reservationName,
                this.conferenceRoomUseDateTime
        );
    }

    public ConferenceRoomId getConferenceRoomId() {
        return conferenceRoomId;
    }

    public ConferenceRoomUseDateTime getConferenceRoomUseDateTime() {
        return conferenceRoomUseDateTime;
    }

    public ReservationName getReservationName() {
        return reservationName;
    }
}
