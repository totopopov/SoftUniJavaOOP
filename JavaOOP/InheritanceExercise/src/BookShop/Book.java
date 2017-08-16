package BookShop;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 20:15.
 */
public class Book {

    private String title;
    private String author;
    private double price;

    public Book(String author,String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    protected String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
    if (title.length()<3){
        throw new IllegalArgumentException("Title not valid!");
    }
        this.title = title;
    }

    protected String getAuthor() {
        return this.author;
    }

    private void setAuthor(String author) {
      String tokens[]=author.split(" ");

         if (tokens.length==2 && Character.isDigit(tokens[1].charAt(0))){
             throw new IllegalArgumentException("Author not valid!");
         }
        this.author = author;
    }

    public double getPrice() {
        return this.price;
    }

    private void setPrice(double price) {
    if (price<1){
        throw new IllegalArgumentException("Price not valid!");
    }
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nTitle: %s%nAuthor: %s%nPrice: %.1f%n",
                this.getClass().getSimpleName(),this.getTitle(), this.getAuthor(), this.getPrice()) ;
    }
}
