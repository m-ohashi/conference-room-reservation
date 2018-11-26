package reservation;

import application.ConferenceRoomApplication;
import conferenceRoom.ConferenceRoomId;
import io.vavr.collection.List;

public interface ConferenceRoomReservationRepository {
    List<ConferenceRoomReservation> referConferenceRoomReservationList(ConferenceRoomId conferenceRoomId);
    void reserve(ConferenceRoomApplication conferenceRoomApplication);
    ReservationId createReservationId();
}
