package OnlineRadioatabase;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 4:51.
 */
public class InvalidArtistNameException extends InvalidSongException {


    public InvalidArtistNameException() {
        super("Artist name should be between 3 and 20 symbols.");
    }
}
