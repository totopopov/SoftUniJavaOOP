package petClinique;

/**
 * Created by Todor Popov using Lenovo on 29.3.2017 г. at 2:05.
 */
public interface ClinicAble {
    String getName();

    PetAble getRoom(int room);

    boolean addPet(PetAble pet);

    boolean releasePet();

    String print(int room);

    boolean hasEmptyRooms();
}
