package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 24.2.2017 г. at 20:46.
 */
public class Person {

    String name;
    double money;
    List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products=new ArrayList<>();
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.equals(null) || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }else {
            this.name = name;
        }
    }

    private double getMoney() {
        return this.money;
    }

    private void setMoney(double money) {
        if (money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }else {
            this.money = money;
        }
    }

    public void buyProduct(Product product){

        if (product.getCost()-this.getMoney()>0){
            throw new IllegalStateException(this.name+" can't afford "+product.getName());
        } else {
            this.setMoney(this.getMoney()-product.getCost());
            this.products.add(product);
            this.PurchaseSuccesful(product);
        }

    }

    private void PurchaseSuccesful(Product product){
        System.out.println(this.getName()+" bought " + product.getName());
    }

    public Iterable<Product> getProducts() {
        return products;
    }
}
