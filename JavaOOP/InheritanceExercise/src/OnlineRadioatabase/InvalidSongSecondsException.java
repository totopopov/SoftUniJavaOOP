package OnlineRadioatabase;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 4:55.
 */
public class InvalidSongSecondsException extends InvalidSongLengthException {
    public InvalidSongSecondsException() {
        super("Song seconds should be between 0 and 59.");
    }
}
