package Exam.Cars;

import java.util.LinkedList;
import java.util.List;

public class PerformanceCar extends Car {
    private List<String> addOns;



    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.addOns=new LinkedList<>();
    }

    private String getAddOns() {
        if (this.addOns.isEmpty()){
            return "None";
        }
        return String.join(", ",this.addOns);
    }

    @Override
    public void addAddOns(String tuneAddon){
        this.addOns.add(tuneAddon);
    }

    @Override
    public void increaseStars(int tuneIndex) {

    }


    @Override
   protected void setHorsepower(int horsepower) {
       super.setHorsepower( horsepower+ ((horsepower*50)/100));
   }

    @Override
    public void setSuspension(int suspension) {
        super.setSuspension(suspension - ((suspension*25)/100));
    }


    @Override
    public String toString() {
        return super.toString()+(System.lineSeparator())+String.format("Add-ons: %s",this.getAddOns());
    }
}
