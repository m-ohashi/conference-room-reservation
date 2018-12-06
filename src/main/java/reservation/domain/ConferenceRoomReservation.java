package reservation.domain;

import conferenceRoom.domain.ConferenceRoomId;
import conferenceRoom.domain.ConferenceRoomUseDateTime;

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

    public boolean isNotEmpty(ConferenceRoomUseDateTime conferenceRoomUseDateTime) {
        return this.conferenceRoomUseDateTime.isDuplicate(conferenceRoomUseDateTime);
    }

    public ConferenceRoomUseDateTime getConferenceRoomUseDateTime() {
        return conferenceRoomUseDateTime;
    }

}
