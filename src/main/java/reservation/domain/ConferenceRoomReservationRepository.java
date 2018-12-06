package reservation.domain;

import conferenceRoom.domain.ConferenceRoomId;
import javaslang.collection.List;


public interface ConferenceRoomReservationRepository {
    List<ConferenceRoomReservation> referConferenceRoomReservationList(ConferenceRoomId conferenceRoomId);
    void reserve(ConferenceRoomReservation conferenceRoomReservation);
    ReservationId createReservationId();
}
