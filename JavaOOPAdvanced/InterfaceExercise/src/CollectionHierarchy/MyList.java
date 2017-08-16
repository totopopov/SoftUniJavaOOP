package CollectionHierarchy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 21.3.2017 г. at 0:11.
 */
public class MyList implements UsedAble {
    private List<String> list;

    public MyList() {
        this.list = new LinkedList<>();
    }

    @Override
    public int used() {
        return this.list.size();
    }

    @Override
    public int add(String element) {
        int index=0;
        this.list.add(index,element);
        return index;
    }

    @Override
    public String remove() {
        int index=0;
        return list.remove(0);
    }
}
