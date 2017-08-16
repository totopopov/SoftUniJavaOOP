package CollectionHierarchy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 21.3.2017 г. at 0:01.
 */
public class AddCollection implements AddAble {
    private List<String> list;

    public AddCollection() {
        this.list = new LinkedList<>();
    }

    @Override
    public int add(String element) {
        this.list.add(element);
        return this.list.size()-1;
    }
}
