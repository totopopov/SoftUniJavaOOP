package CarShopExtended;


import java.io.Serializable;

public class Audi implements Rentable,Serializable {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProdced;
    private Integer minRentDays;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower,String countryProdced, Integer minRentDays, Double pricePerDay) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProdced=countryProdced;
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDays;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",this.getModel(),this.countryProdced, this.TIRES);

    }
}
