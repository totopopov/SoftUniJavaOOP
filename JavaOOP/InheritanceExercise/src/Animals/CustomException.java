package Animals;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 18:04.
 */
public class CustomException extends IllegalArgumentException {
    public CustomException() {
        super("Invalid input!");
    }
}
