package eventImplementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 19:11.
 */
public class Dispatcher {

    private String name;
    private Handler handler;

    private List<NameChangeListener> listeners;

    public Dispatcher() {
        this.listeners = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
        NameChange event = new NameChange(this.name,this);
        this.fireNameChangeEvent(event);
    }

    public void addNameChangeListener(NameChangeListener listener){
        this.listeners.add(listener);
    };
    public void removeNameChangeListener(NameChangeListener listener){
        this.listeners.remove(listener);
    };
    public void fireNameChangeEvent(NameChange event){
        for (NameChangeListener listener : this.listeners) {
            listener.handleChangedName(event);
        }
    };


}
