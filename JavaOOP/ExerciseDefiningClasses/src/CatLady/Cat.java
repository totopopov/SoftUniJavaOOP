package CatLady;

/**
 * Created by Todor Popov using Lenovo on 16.3.2017 г. at 19:11.
 */
public abstract class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean findByName(String name){
        return this.getName().equals(name);
    }

}
