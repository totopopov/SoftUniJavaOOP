package StackOfStrings;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 19:37.
 */
public class Main {
    public static void main(String[] args) {

        StackOfStrings stackOfStrings=new StackOfStrings();

        stackOfStrings.push("Pesho");
        stackOfStrings.push("Gosho");
        stackOfStrings.push("Stamat");

        System.out.println(stackOfStrings.isEmpty());

        System.out.println(stackOfStrings.peek());

        while (!stackOfStrings.isEmpty()){
            System.out.println(stackOfStrings.pop());
        }


    }
}
