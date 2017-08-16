package LabShapes;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 23:51.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radios) {
        super(radios);
        this.setRadius(radios);
    }


    public final  double getRadius() {
        return this.radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculatePerimeter() {
        return super.getPerimeter();
    }

    @Override
    protected double calculateArea() {
        return super.getArea();
    }
}
