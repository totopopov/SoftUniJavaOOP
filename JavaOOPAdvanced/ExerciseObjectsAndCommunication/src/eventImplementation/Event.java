package eventImplementation;

import java.util.EventObject;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 19:14.
 */
public class Event  extends EventObject{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public Event(Object source) {
        super(source);
    }
}
