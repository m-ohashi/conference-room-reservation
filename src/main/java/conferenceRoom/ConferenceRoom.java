package conferenceRoom;

public class ConferenceRoom {
    private final ConferenceRoomId conferenceRoomId;
    private final ConferenceRoomName conferenceRoomName;

    public ConferenceRoom(ConferenceRoomId conferenceRoomId, ConferenceRoomName conferenceRoomName) {
        this.conferenceRoomId = conferenceRoomId;
        this.conferenceRoomName = conferenceRoomName;
    }
}
