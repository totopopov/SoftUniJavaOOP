package dungensAndDragons.observers;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 17:40.
 */
public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();

}
