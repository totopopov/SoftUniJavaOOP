package Animals;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 17:43.
 */
public class Tomcat extends Cat{

    public Tomcat(String name, String age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void setGender(String gender) {
        super.setGender(gender);
        super.setGender("Male");

    }

    @Override
    public void produceSound() {
        super.produceSound("Give me one million b***h");
    }

}
