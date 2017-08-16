package petClinique;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 20:44.
 */
public class Pet implements PetAble {
    private String name;
    private int age;
    private String kind;

    public Pet(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getKind() {
        return this.kind;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",this.getName(),this.getAge(),this.getKind());
    }
}
