import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 15.2.2017 г..
 */
public class CommandInterpreter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] dataset = reader.readLine().split("\\s+");

        String commmand;

        while ("end".equals(commmand=reader.readLine())){

            String[] commnadTokens=commmand.split("\\s+");

            switch (commnadTokens[1]){
                case "reverse":
                    int startIndex=Integer.parseInt(commnadTokens[2]);


                    break;
                case "sort": break;
                case "rollLeft": break;
                case "rollRight": break;
            }





        }


    }
}
