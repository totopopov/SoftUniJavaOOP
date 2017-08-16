package ShoppingSpree;

/**
 * Created by Todor Popov using Lenovo on 24.2.2017 г. at 20:46.
 */
public class Product {
    private String name;
    private double cost;


    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.equals(null) || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }else {
            this.name = name;
        }
    }

    public double getCost() {
        return this.cost;
    }

    private void setCost(double cost) {
        if (cost<0){
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.cost = cost;
        }
    }


}
