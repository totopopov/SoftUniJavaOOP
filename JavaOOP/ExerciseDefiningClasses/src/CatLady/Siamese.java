package CatLady;

/**
 * Created by Todor Popov using Lenovo on 16.3.2017 г. at 19:11.
 */
public class Siamese extends Cat {
    private int earSize;

    public Siamese(String name, int earSize) {
        super(name);
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d",this.getClass().getSimpleName(),super.getName(),this.earSize);
    }

}
