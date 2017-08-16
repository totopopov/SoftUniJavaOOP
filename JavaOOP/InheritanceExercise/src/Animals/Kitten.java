package Animals;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 17:39.
 */
public class Kitten extends Cat{
    public Kitten(String name, String age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void setGender(String gender) {
        super.setGender(gender);
        super.setGender("Female");
    }

    @Override
    public void produceSound(){
        super.produceSound("Miau");
    }
}
