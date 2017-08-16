package collection;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 0:57.
 */
public interface Register<T> {
    void enqueueEmergency(T emergency);

    T dequeueEmergency();

    T peekEmergency();

    Boolean isEmpty();

    Integer lenght();
}
