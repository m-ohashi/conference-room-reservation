package conferenceRoom.domain;

public class ConferenceRoomUseDateTime {
    private final ConferenceRoomUseFromDateTime fromDateTime;
    private final ConferenceRoomUseToDateTime toDateTime;

    public ConferenceRoomUseDateTime(
            ConferenceRoomUseFromDateTime fromDateTime,
            ConferenceRoomUseToDateTime toDateTime) {
        this.fromDateTime = fromDateTime;
        this.toDateTime = toDateTime;
    }

    public ConferenceRoomUseFromDateTime getFromDateTime() {
        return fromDateTime;
    }

    public ConferenceRoomUseToDateTime getToDateTime() {
        return toDateTime;
    }

    public boolean isDuplicate(ConferenceRoomUseDateTime conferenceRoomUseDateTime) {

        return !(conferenceRoomUseDateTime.getToDateTime().isBefore(this.fromDateTime)
                || conferenceRoomUseDateTime.getFromDateTime().isAfter(this.toDateTime));
    }

    public String getStringValue() {
        return fromDateTime.getValue().toString() + "-" + toDateTime.getValue().toString();
    }

}
