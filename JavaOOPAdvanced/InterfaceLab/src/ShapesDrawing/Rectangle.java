package ShapesDrawing;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 15:25.
 */
public class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.height; i++) {
            sb.append("*");
            for (int k = 1; k < this.width - 1; k++) {
                sb.append(" ");
                if (i == 0 || i == (this.height - 1)) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append(" ");
            sb.append("*");
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}

