package CollectionHierarchy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 21.3.2017 г. at 0:03.
 */
public class AddRemoveCollection implements AddRemoveAble {
    private List<String> list;

    public AddRemoveCollection() {
        this.list = new LinkedList<>();
    }

    @Override
    public int add(String element) {
            int index=0;
            this.list.add(index,element);
            return index;
    }

    @Override
    public String remove() {
        int index=list.size()-1;
        return list.remove(index);
    }
}
