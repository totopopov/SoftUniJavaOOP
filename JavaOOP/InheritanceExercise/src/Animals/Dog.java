package Animals;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 17:48.
 */
public class Dog extends Animal {
    public Dog(String name, String age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        super.produceSound("BauBau");
    }
}
