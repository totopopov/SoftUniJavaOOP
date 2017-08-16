package Person;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 20:02.
 */
public class Child extends Person{

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    protected void setAge(int age) {
        if (age>15){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        super.setAge(age);
    }


}
