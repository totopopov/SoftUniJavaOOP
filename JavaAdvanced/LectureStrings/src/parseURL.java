import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class parseURL {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("://");

        String protocol = input[0];

        boolean wrongInput=false;

        if (input.length!=2){
            System.out.println("Invalid URL");
            return;
        }
        int index = input[1].indexOf("/");

        String server=input[1].substring(0,index);

        String resources=input[1].substring(index+1);

            System.out.println("Protocol = "+protocol);
            System.out.println("Server = "+server);
            System.out.println("Resources = "+resources);
    }
}
