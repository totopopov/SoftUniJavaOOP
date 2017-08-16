package ClassBoxDataValidation;

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
        return this.lenght;
    }

    private void setLenght(double length) {

        if (length<=0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }else {
            this.lenght = length;
        }

    }

    private double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        if (width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }else {
            this.width = width;
        }
    }

    private double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {
        if (height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
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
