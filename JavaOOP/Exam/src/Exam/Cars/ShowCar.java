package Exam.Cars;


public class ShowCar extends Car {
    private int stars;

    public ShowCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.stars=0;
    }

    @Override
    public void addAddOns(String tuneAddon) {
    }

    @Override
    public void increaseStars(int tuneAddon) {
        this.stars=this.stars+tuneAddon;
    }

    @Override
    public String toString() {
        return super.toString()+(System.lineSeparator())+String.format("%d *",this.stars);
    }
}
