package AnimalFarm;

/**
 * Created by Todor Popov using Lenovo on 24.2.2017 г. at 20:15.
 */
public class Chicken {

    private String name;
    private double age;

    public Chicken(String name, double age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {

        if (name.length()<=0 || name.equals(" ")){
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    public double getAge() {
        return this.age;
    }

    private void setAge(double age) {

        if (age<0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }else {
            this.age = age;
        }
    }
    private String getProductPerDay(){

        if (this.getAge()<6){
            return "2";
        } else if (this.getAge()<12){
            return "1";
        } else {
        return "0.75";
        }
    }

    public String getProduction(){
        return this.getProductPerDay();
    }

}
