package reservationResult;

import conferenceRoom.domain.ConferenceRoom;
import javaslang.collection.List;
import reservation.domain.ConferenceRoomReservation;

public class DoubleBookingConferenceRoomApplication implements ResultNg {
    private final List<ConferenceRoomReservation> conferenceRoomReservationList;
    private final ConferenceRoom conferenceRoom;

    public DoubleBookingConferenceRoomApplication(
            List<ConferenceRoomReservation> conferenceRoomReservationList,
            ConferenceRoom conferenceRoom) {
        this.conferenceRoomReservationList = conferenceRoomReservationList;
        this.conferenceRoom = conferenceRoom;
    }

    @Override
    public String display() {
        return conferenceRoom.getConferenceRoomName().getValue() + ":" + conferenceRoomReservationList
                .map(v -> v.getConferenceRoomUseDateTime().getStringValue());
    }
}
