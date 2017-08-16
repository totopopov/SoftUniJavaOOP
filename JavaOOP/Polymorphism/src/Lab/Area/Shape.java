package Lab.Area;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 20:09.
 */
public abstract class Shape {
    private double sideA;
    private double sideB;

    public Shape(double sideA, double sideB) {
        this.setSideA(sideA);
        this.setSideB(sideB);
    }

    public Shape(double sideA) {
        this.setSideA(sideA);
        this.setSideB(sideA);
    }

    private double getSideA() {
        return this.sideA;
    }

    private void setSideA(double sideA) {
        this.sideA = sideA;
    }

    private double getSideB() {
        return this.sideB;
    }

    private void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getArea(){
        return this.getSideA()*this.getSideB();
    }

}
