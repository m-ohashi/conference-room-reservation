package reservation;

import conferenceRoom.ConferenceRoomId;
import conferenceRoom.ConferenceRoomUseDateTime;

public class ConferenceRoomReservation {
    private final ReservationId reservationId;
    private final ConferenceRoomId conferenceRoomId;
    private final ReservationName reservationName;
    private final ConferenceRoomUseDateTime conferenceRoomUseDateTime;

    public ConferenceRoomReservation(
            ReservationId reservationId,
            ConferenceRoomId conferenceRoomId,
            ReservationName reservationName, ConferenceRoomUseDateTime conferenceRoomUseDateTime) {
        this.reservationId = reservationId;
        this.conferenceRoomId = conferenceRoomId;
        this.reservationName = reservationName;
        this.conferenceRoomUseDateTime = conferenceRoomUseDateTime;
    }

    public boolean isEmpty(ConferenceRoomUseDateTime conferenceRoomUseDateTime) {
        return false;
    }
}
