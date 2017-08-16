package PIzzaCalories;

/**
 * Created by Todor Popov using Lenovo on 25.2.2017 г. at 4:30.
 */
public class Topping {
    private String toppingType;
    private double typeModifier;
    private double weight;


    public Topping(double weight, String topping) {
        this.setToppingType(topping);
        this.setTypeModifier(topping);
        this.setWeight(weight);
    }

    private String getToppingType() {
        return this.toppingType;
    }

    private void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }


    private double getTypeModifier() {
        return this.typeModifier;
    }

    private void setTypeModifier(String typeModifier) {

        switch (typeModifier.toLowerCase()) {
            case "meat":
                this.typeModifier = 1.2;
                break;
            case "veggies":
                this.typeModifier = 0.8;
                break;
            case "cheese":
                this.typeModifier = 1.1;
                break;
            case "sauce":
                this.typeModifier = 0.9;
                break;

            default:
                throw new IllegalArgumentException("Cannot place " + typeModifier + " on top of your pizza.");
        }
    }

    private double getWeight() {
        return this.weight;
    }

    private void setWeight(double weight) {
        if (weight<1 || weight>50){
            throw new IllegalArgumentException(this.getToppingType() + " weight should be in the range [1..50].");
        }

        this.weight = weight;
    }

    public double getToppingCallories(){
        return 2*this.getWeight()*this.getTypeModifier();
    }

}
