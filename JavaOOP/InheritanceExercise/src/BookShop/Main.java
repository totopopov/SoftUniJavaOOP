package BookShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 20:32.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String author=reader.readLine();
        String title=reader.readLine();
        double price =Double.parseDouble(reader.readLine());

        try {
            Book book=new Book(author,title,price);
            GoldenEditionBook goldenEditionBook= new GoldenEditionBook(author,title,price);
            Method[] bookDeclaredMethods = Book.class.getDeclaredMethods();
            Method[] goldenBookDeclaredMethods =
                    GoldenEditionBook.class.getDeclaredMethods();

            if (goldenBookDeclaredMethods.length > 1) {
                throw new IllegalClassFormatException("Code duplication in GoldenEditionBook!");
            }

            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());

        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }catch (IllegalClassFormatException icfe){
            System.out.println(icfe.getMessage());
        }


    }
}
