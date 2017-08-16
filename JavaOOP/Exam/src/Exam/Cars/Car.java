package Exam.Cars;


public abstract class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsepower;
    private int acceleration;
    private int suspension;
    private int durability;


    public Car(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.setHorsepower(horsepower);
        this.acceleration=acceleration;
        this.setSuspension(suspension);
        this.durability=durability;
    }




    public int getHorsepower() {
        return this.horsepower;
    }

    protected void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void increaseHorsePower(int horsepower){
        this.horsepower=this.getHorsepower()+horsepower;
    }

    public void increaseSuspension(int suspension){
        this.suspension=this.getSuspension()+((suspension*50)/100);
    }


    public int getAcceleration() {
        return this.acceleration;
    }


    public int getSuspension() {
        return this.suspension;
    }

    protected void setSuspension(int suspension) {
        this.suspension = suspension;
    }


    public int getDurability() {
        return this.durability;
    }

    public String getRaceInfo(){
        return this.brand+" "+this.model;
    }

    public abstract void addAddOns(String tuneAddon);
    public abstract void increaseStars(int tundeIndex);


    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s %s",this.brand, this.model,this.yearOfProduction)).append(System.lineSeparator())
                .append(String.format("%s HP, 100 m/h in %s s",this.getHorsepower(), this.acceleration)).append(System.lineSeparator())
                .append(String.format("%s Suspension force, %s Durability",this.getSuspension(), this.durability));
        return sb.toString();
    }
}
