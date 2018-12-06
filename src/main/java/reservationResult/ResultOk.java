package reservationResult;

import conferenceRoom.domain.ConferenceRoomName;
import conferenceRoom.domain.ConferenceRoomUseDateTime;
import reservation.domain.ReservationName;

public class ResultOk {
    private final ConferenceRoomName conferenceRoomName;
    private final ConferenceRoomUseDateTime conferenceRoomUseDateTime;
    private final ReservationName reservationName;

    public ResultOk(
            ConferenceRoomName conferenceRoomName,
            ConferenceRoomUseDateTime conferenceRoomUseDateTime, ReservationName reservationName) {
        this.conferenceRoomName = conferenceRoomName;
        this.conferenceRoomUseDateTime = conferenceRoomUseDateTime;
        this.reservationName = reservationName;
    }
}
