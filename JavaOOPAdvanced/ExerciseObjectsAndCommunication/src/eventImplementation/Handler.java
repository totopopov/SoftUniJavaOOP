package eventImplementation;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 19:11.
 */

public class Handler implements NameChangeListener{

    @Override
    public void handleChangedName(NameChange event) {
        System.out.println(String.format("Dispatcher's name changed to %s.",event.getName()));
    }
}
