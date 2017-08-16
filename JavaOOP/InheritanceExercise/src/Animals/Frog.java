package Animals;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 17:47.
 */
public class Frog extends Animal {

    public Frog(String name, String age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        super.produceSound("Frogggg");
    }
}
