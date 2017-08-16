package BookShop;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 20:30.
 */
public class GoldenEditionBook extends Book{

    public GoldenEditionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice()*1.3;
    }

}
