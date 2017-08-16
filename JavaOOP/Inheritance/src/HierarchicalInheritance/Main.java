package HierarchicalInheritance;

/**
 * Created by Todor Popov using Lenovo on 28.2.2017 г. at 15:26.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meaw();
    }
}
