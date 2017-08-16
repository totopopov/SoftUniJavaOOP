package Animals;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 17:41.
 */
public class Cat extends Animal {


    public Cat(String name, String age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound(){
       super.produceSound("MiauMiau");
    }
}
