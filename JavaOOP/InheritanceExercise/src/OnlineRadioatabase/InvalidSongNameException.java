package OnlineRadioatabase;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 4:53.
 */
public class InvalidSongNameException extends InvalidSongException {

    public InvalidSongNameException() {
        super("Song name should be between 3 and 30 symbols.");
    }
}
