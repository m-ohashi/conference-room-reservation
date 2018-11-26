package application;

import conferenceRoom.ConferenceRoomId;
import conferenceRoom.ConferenceRoomUseDateTime;
import reservation.ConferenceRoomReservation;
import reservation.ReservationName;

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

    public ConferenceRoomReservation createConferenceRoomReservation(){
        return null;
    }
}
