package ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 19:22.
 */
public class RandomArrayList extends ArrayList{

    private Random rnd;

    public RandomArrayList(){
        this.rnd=new Random();
    }

    public Object getRandomElement(){
        int index = rnd.nextInt(super.size());

        Object element = super.get(index);
        super.set(index,super.get(super.size()-1));
        super.remove(super.size()-1);

        return  element;
    }

}
