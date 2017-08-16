package OnlineRadioatabase;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 4:54.
 */
public class InvalidSongLengthException extends InvalidSongException {

    public InvalidSongLengthException(String message) {
        super(message);
    }

    public InvalidSongLengthException() {
        super("Invalid song length.");
    }
}
