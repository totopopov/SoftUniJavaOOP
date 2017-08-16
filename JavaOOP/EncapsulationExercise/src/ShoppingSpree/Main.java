package ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 24.2.2017 г. at 20:45.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Person> perons=new LinkedHashMap<>();
        HashMap<String,Product> products=new LinkedHashMap<>();

        String[] names = reader.readLine().split(";");
        for (String s : names) {
           String[]tokens= s.split("=");
           String name=tokens[0];
           double money=Double.parseDouble(tokens[1]);
           try {
               Person person = new Person(name,money);
               perons.putIfAbsent(name,person);
           }catch (IllegalArgumentException iae){
               System.out.println(iae.getMessage());
               return;
           }
        }
        String[] productsInStore = reader.readLine().split(";");
        for (String s : productsInStore) {
            String[]tokens= s.split("=");
            String name=tokens[0];
            double money=Double.parseDouble(tokens[1]);
            try {
                Product product = new Product(name,money);
                products.putIfAbsent(name,product);
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
                return;
            }
        }
        String command;
        while (!"END".equals(command=reader.readLine())){

            String[] tokens = command.split(" ");

            String personToBuy=tokens[0];
            String productToBuy=tokens[1];

            try {
                perons.get(personToBuy).buyProduct(products.get(productToBuy));
            }catch (IllegalStateException ies){
                System.out.println(ies.getMessage());
            }
        }

        perons.entrySet().stream().forEach(p->{

            if(p.getValue().getProducts().iterator().hasNext()){
                List<String> data=new ArrayList<>();
                p.getValue().getProducts().forEach(i->data.add(i.getName()));
                System.out.println(p.getKey() + " - " + String.join(", ",data));
            }else {
                System.out.println(p.getKey()+" - Nothing bought");
            }
        });



    }

}
