package LabShapes;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 20:09.
 */
public abstract class Shape {
    private double perimeter;
    private double area;

    protected Shape(double sideA, double sideB) {
            this.setArea(sideA*sideB);
            this.setPerimeter(2*(sideA+sideB));
    }

    protected Shape(double radios) {
        this.setPerimeter(2*3.14*radios);
        this.setArea(radios*radios*3.14);
    }


    protected final double getPerimeter() {
        return this.perimeter;
    }

    private final void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected final double getArea() {
        return this.area;
    }

    private final void setArea(double area) {
        this.area = area;
    }

    protected abstract double calculatePerimeter();
    protected abstract double calculateArea();


}
