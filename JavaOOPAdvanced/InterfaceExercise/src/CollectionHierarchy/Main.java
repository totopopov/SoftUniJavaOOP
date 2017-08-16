package CollectionHierarchy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 23:51.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] inputs = reader.readLine().split(" ");

        int removeOperation=Integer.parseInt(reader.readLine());

        AddAble addAble=new AddCollection();
        AddRemoveAble addRemoveAble=new AddRemoveCollection();
        UsedAble usedAble=new MyList();

        StringBuilder sbAddable = new StringBuilder();
        StringBuilder sbRemovable = new StringBuilder();
        StringBuilder sbUsed = new StringBuilder();

        for (String input : inputs) {
            sbAddable.append(addAble.add(input)).append(" ");
            sbRemovable.append(addRemoveAble.add(input)).append(" ");
            sbUsed.append(usedAble.add(input)).append(" ");
        }

        System.out.println(sbAddable.toString().trim());
        System.out.println(sbRemovable.toString().trim());
        System.out.println(sbUsed.toString().trim());

        sbRemovable.delete(0,sbRemovable.length()-1);
        sbUsed.delete(0,sbUsed.length()-1);

        for (int i = 0; i < removeOperation; i++) {
            sbRemovable.append(addRemoveAble.remove()).append(" ");
            sbUsed.append(usedAble.remove()).append(" ");
        }

        System.out.println(sbRemovable.toString().trim());
        System.out.println(sbUsed.toString().trim());


    }
}
