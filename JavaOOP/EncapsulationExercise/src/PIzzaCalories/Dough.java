package PIzzaCalories;

/**
 * Created by Todor Popov using Lenovo on 25.2.2017 г. at 3:37.
 */
public class Dough {
    private double weight;
    private double doughTypeModifier;
    private double doughBakingModifier;

    public Dough(double weight, String doughType, String doughBaking) {
        this.setDoughTypeModifier(doughType);
        this.setWeight(weight);
        this.setDoughBakingModifier(doughBaking);
    }

    private double getWeight() {
        return this.weight;
    }

    private void setWeight(double weight) {
        if (weight<1 || weight>200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;

    }

    private double getDoughTypeModifier() {
        return this.doughTypeModifier;
    }

    private void setDoughTypeModifier(String doughTypeModifier) {
        switch (doughTypeModifier.toLowerCase()) {
            case "wholegrain":
                this.doughTypeModifier = 1.0;
                break;
            case "white":
                this.doughTypeModifier = 1.5;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    private double getDoughBakingModifier() {
        return this.doughBakingModifier;
    }

    private void setDoughBakingModifier(String doughBakingModifier) {
        switch (doughBakingModifier.toLowerCase()){

            case "crispy":
                this.doughBakingModifier = 0.9;
                break;
            case "chewy":
                this.doughBakingModifier = 1.1;
                break;
            case "homemade":
                this.doughBakingModifier = 1.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    public double calculateCalories(){
        return 2*this.getWeight()*this.getDoughBakingModifier()*this.getDoughTypeModifier();
    }


}
