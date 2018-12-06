package conferenceRoom.domain;

import java.time.LocalDateTime;

public class ConferenceRoomUseToDateTime {
    private final LocalDateTime value;

    public ConferenceRoomUseToDateTime(LocalDateTime value) {
        this.value = value;
    }

    public LocalDateTime getValue() {
        return value;
    }

    public boolean isBefore(ConferenceRoomUseFromDateTime conferenceRoomUseFromDateTime) {
        return value.isBefore(conferenceRoomUseFromDateTime.getValue());
    }
}
