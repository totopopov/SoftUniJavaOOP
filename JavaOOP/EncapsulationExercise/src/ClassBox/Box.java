package ClassBox;

/**
 * Created by Todor Popov using Lenovo on 24.2.2017 г. at 19:15.
 */
public class Box {

    private double lenght;
    private double width;
    private double height;

    public Box(double lenght, double width, double height) {
        setLenght(lenght);
        setWidth(width);
        setHeight(height);
    }

    private double getLenght() {
        return lenght;
    }

    private void setLenght(double lenght) {
        this.lenght = lenght;
    }

    private double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getLateralSurface() {
        return 2 * (this.getHeight() * this.getLenght() + getHeight() * getWidth());
    }


    public double getSurfaceArea() {
        return   this.getLateralSurface()+   2 * (getLenght() * getWidth());
    }

    public double getVolume(){
        return getHeight()*getWidth()*getLenght();
    }
}
