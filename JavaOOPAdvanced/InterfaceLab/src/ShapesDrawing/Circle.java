package ShapesDrawing;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 15:17.
 */
public class Circle implements Drawable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        double r_in = this.radius - 0.4;
        double r_out = this.radius + 0.4;
        for (double y = this.radius; y >= -this.radius; --y) {
            for (double x = -this.radius; x < r_out; x += 0.5) {
                double value = x * x + y * y;
                if (value >= r_in * r_in && value <= r_out * r_out) {
                   sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
