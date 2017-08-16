package OnlineRadioatabase;

import java.io.IOException;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 4:42.
 */
public class InvalidSongException extends IllegalArgumentException{

    public InvalidSongException(String message) {
        super(message);
    }

    public InvalidSongException() {
        super("Invalid song.");
    }
}
