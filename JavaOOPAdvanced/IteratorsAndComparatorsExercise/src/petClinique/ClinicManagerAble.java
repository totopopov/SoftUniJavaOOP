package petClinique;

/**
 * Created by Todor Popov using Lenovo on 29.3.2017 г. at 2:50.
 */
public interface ClinicManagerAble {
    void createPet(String name, int age, String kind);

    void createClinic(String name, int rooms);

    boolean add(String petname, String hospitalName);

    boolean releasePet(String hospitalName);

    void hasEmptyRoomsInClinic(String hospitalName);

    void print(String hospitalName, int room);

    void print(String hospitalName);
}
