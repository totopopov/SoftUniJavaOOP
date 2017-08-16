package Animals;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 17:34.
 */
public class Animal {

   private String name;
   private int age;
   private boolean gender;


    public Animal(String name, String age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    private String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name==null || name.isEmpty()){
            throw new CustomException();
        }
        this.name = name;
    }

    private int getAge() {
        return this.age;
    }

    private void setAge(String age) {

        if (age==null){
            throw new CustomException();
        }

        int currentAge;

        try {
            currentAge=Integer.parseInt(age);
        } catch (IllegalArgumentException iae){
            throw new CustomException();
        }

        if (currentAge<0){
            throw new CustomException();
        }
        this.age = currentAge;
    }

    protected boolean getGender() {
        return this.gender;
    }

    protected void setGender(String gender) {
        if (gender.equals("Female") || gender.equals("Male")){
            this.gender = !gender.equals("Female");
        } else {
            throw new CustomException();
        }
    }

    public void produceSound(){
        System.out.println("Not implemented!");
    }

    public void produceSound(String sound){
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s",this.getClass().getSimpleName(),this.getName(),this.getAge(),this.getGender()?"Male":"Female");
    }
}
