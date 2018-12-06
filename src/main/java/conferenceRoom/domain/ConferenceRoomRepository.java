package conferenceRoom.domain;


import javaslang.control.Option;

public interface ConferenceRoomRepository {
    Option<ConferenceRoom> find(ConferenceRoomId conferenceRoomId);
}
