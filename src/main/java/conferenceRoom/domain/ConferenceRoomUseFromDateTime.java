package conferenceRoom.domain;

import java.time.LocalDateTime;

public class ConferenceRoomUseFromDateTime {
    private final LocalDateTime value;

    public ConferenceRoomUseFromDateTime(LocalDateTime value) {
        this.value = value;
    }

    public boolean isAfter(ConferenceRoomUseToDateTime conferenceRoomUseToDateTime) {
        return value.isAfter(conferenceRoomUseToDateTime.getValue());
    }

    public LocalDateTime getValue() {
        return value;
    }
}
