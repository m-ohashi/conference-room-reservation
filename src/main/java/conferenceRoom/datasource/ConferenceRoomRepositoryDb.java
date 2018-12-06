package conferenceRoom.datasource;

import conferenceRoom.domain.ConferenceRoom;
import conferenceRoom.domain.ConferenceRoomId;
import conferenceRoom.domain.ConferenceRoomName;
import conferenceRoom.domain.ConferenceRoomRepository;
import javaslang.control.Option;

public class ConferenceRoomRepositoryDb implements ConferenceRoomRepository {
    @Override
    public Option<ConferenceRoom> find(ConferenceRoomId conferenceRoomId) {
        return Option.of(new ConferenceRoom(conferenceRoomId,new ConferenceRoomName("A")));
    }
}
