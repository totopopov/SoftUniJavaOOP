package petClinique;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Todor Popov using Lenovo on 29.3.2017 г. at 2:06.
 */
public class ClinicManager implements ClinicManagerAble {
    private Map<String,ClinicAble> clinics;
    private Map<String,PetAble> pets;

    public ClinicManager() {
        this.clinics = new LinkedHashMap<>();
        this.pets = new LinkedHashMap<>();
    }

    @Override
    public void createPet(String name, int age, String kind){
        PetAble pet = new Pet(name,age,kind);

        pets.putIfAbsent(pet.getName(),pet);
    }

    @Override
    public void createClinic(String name, int rooms){
        try {
            ClinicAble clinic = new Clinic(name,rooms);
            clinics.putIfAbsent(clinic.getName(),clinic);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    @Override
    public boolean add(String petname, String hospitalName){
        if (!pets.containsKey(petname)){
            return false;
        }

        if (!clinics.containsKey(hospitalName)){
            return false;
        }
     return clinics.get(hospitalName).addPet(pets.get(petname));

    }

    @Override
    public boolean releasePet(String hospitalName){
        if (!clinics.containsKey(hospitalName)){
            return false;
        }

        return clinics.get(hospitalName).releasePet();
    }

    @Override
    public void hasEmptyRoomsInClinic(String hospitalName){
        if (!clinics.containsKey(hospitalName)){
            throw new IllegalArgumentException("Invalid Operation!");
        }
        System.out.println(clinics.get(hospitalName).hasEmptyRooms());
    }

    @Override
    public void print(String hospitalName, int room){
        if (!clinics.containsKey(hospitalName)){
            throw new IllegalArgumentException("Invalid Operation!");
        }
        room--;
        System.out.println(clinics.get(hospitalName).print(room));
    }

    @Override
    public void print(String hospitalName){
        if (!clinics.containsKey(hospitalName)){
            throw new IllegalArgumentException("Invalid Operation!");
        }
        System.out.println(clinics.get(hospitalName));
    }
}
