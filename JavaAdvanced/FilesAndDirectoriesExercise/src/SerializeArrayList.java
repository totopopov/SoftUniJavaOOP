import java.io.*;
import java.util.ArrayList;

/**
 * Created by Lenovo on 31.1.2017 г..
 */
public class SerializeArrayList {
    private final static String projectPath=System.getProperty("user.dir")+"/src/resources/";
    private final static String file1Path=projectPath+"list.ser";

    public static void main(String[] args) throws IOException {


        FileOutputStream out = new FileOutputStream(file1Path);




        try (ObjectOutputStream stream = new ObjectOutputStream(out);
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file1Path))){


            ArrayList<Integer> data = new ArrayList<>();

            for (int i = 0; i <1024 ; i++) {
                data.add(i*2+i/7+(i*8)/12);
            }

                stream.writeObject(data);


            try {
                ArrayList<Integer> input =(ArrayList<Integer>) in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            for (Integer datum : data) {
                System.out.println(datum);
            }

        }

    }
}
