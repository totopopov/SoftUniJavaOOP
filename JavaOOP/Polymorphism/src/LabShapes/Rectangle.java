package LabShapes;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 23:45.
 */
public class Rectangle extends Shape {
    private double height;
    private double width;
    public Rectangle(double height, double width) {
        super(height, width);
        this.setHeight(height);
        this.setWidth(width);
    }

    public final double getHeight() {
        return height;
    }

    public final double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected double calculatePerimeter() {
     return super.getPerimeter();
    }

    @Override
    protected double calculateArea() {
       return super.getPerimeter();
    }
}
