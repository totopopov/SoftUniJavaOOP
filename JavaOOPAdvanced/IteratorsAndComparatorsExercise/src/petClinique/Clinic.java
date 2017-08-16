package petClinique;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 20:58.
 */
public class Clinic implements Iterable<PetAble>, ClinicAble {
    private String name;
    private PetAble[] rooms;
    private int cursor;

    public Clinic(String name, int rooms) {
        this.name = name;
        this.setRooms(rooms);
    }

    private void setRooms(int rooms) {
        if (rooms % 2 == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.rooms = new PetAble[rooms];
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public PetAble getRoom(int room) {
        return this.rooms[room];
    }

    @Override
    public boolean addPet(PetAble pet) {
        Iterator<PetAble> crazyInterator = new RoomCustomAddIntegrator();

        while (crazyInterator.hasNext()) {
            PetAble currentPet = crazyInterator.next();
            if (currentPet == null) {
                this.rooms[cursor] = pet;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean releasePet() {
        Iterator<PetAble> crazyInterator = new RoomCustomReleaseIntegrator();

        while (crazyInterator.hasNext()) {
            PetAble currentPet = crazyInterator.next();
            if (currentPet != null) {
                this.rooms[cursor] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasEmptyRooms(){
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i]==null){
                return true;
            }
        }
        return false;
    }

    @Override
    public String print(int room) {
        if (this.rooms[room] == null) {
            return "Room empty";
        } else return this.rooms[room].toString();
    }


    @Override
    public void forEach(Consumer<? super PetAble> action) {
        Iterator<PetAble> interatorForEach = new RoomIterator();
        while (interatorForEach.hasNext()) {
            action.accept(interatorForEach.next());
        }
    }

    @Override
    public Iterator<PetAble> iterator() {
        return new RoomIterator();
    }

    private final class RoomIterator implements Iterator<PetAble> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < rooms.length;
        }

        @Override
        public PetAble next() {
            return rooms[index++];
        }
    }

    private final class RoomCustomAddIntegrator implements Iterator<PetAble> {
        private int index = rooms.length / 2;
        private int counter = 1;
        private boolean forward = false;

        @Override
        public boolean hasNext() {
            return this.index < rooms.length && this.index > -1;
        }

        @Override
        public PetAble next() {
            int currentIndex = index;

            index = forward ? index + counter++ : index - counter++;

            forward = !forward;

            cursor=currentIndex;
            return rooms[currentIndex];
        }
    }

    private final class RoomCustomReleaseIntegrator implements Iterator<PetAble> {
        private int index = rooms.length / 2;
        private boolean forward = true;

        @Override
        public boolean hasNext() {
            return this.index < rooms.length && this.index > -1;
        }

        @Override
        public PetAble next() {
            int currentIndex = index++;

            if (index == rooms.length && forward) {
                index = 0;
                forward = false;
            }

            cursor=currentIndex;
            return rooms[currentIndex];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rooms.length; i++) {

            sb.append(this.print(i)).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
