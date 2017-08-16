package OnlineRadioatabase;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 4:55.
 */
public class InvalidSongMinutesException extends InvalidSongLengthException {
    public InvalidSongMinutesException() {
        super("Song minutes should be between 0 and 14.");
    }
}
