package reservationResult;

public class NotExistConferenceRoom implements ResultNg {
    @Override
    public String display() {
        return "会議室はありません";
    }
}
