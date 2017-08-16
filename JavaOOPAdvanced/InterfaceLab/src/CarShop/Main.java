package CarShop;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 15:39.
 */
public class Main {
    public static void main(String[] args) {

        Car seat = new Seat("Leon", "gray", 110, "Spain");

                System.out.println(String.format("%s is %s color and have %s horse power",
                        seat.getModel(),
                        seat.getColor(),
                        seat.getHorsePower()));
        System.out.println(seat.toString());
    }
}
