import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<String,LinkedHashMap<String,Integer>> data=new TreeMap<>();

        String input="";

        while (!"end".equals(input=sc.nextLine())){

            String [] helper= input.split(" ");

            String currentUser=helper[2].substring(5) ;

            String currentIP=helper[0].substring(3);


            if (!data.containsKey(currentUser)){



                LinkedHashMap<String,Integer> entry=new LinkedHashMap<>();

                entry.put(currentIP,1);

                data.put(currentUser,entry);
            }else {

                if (!data.get(currentUser).containsKey(currentIP)){
                    data.get(currentUser).put(currentIP,1);
                }else {
                    int numberEntries=data.get(currentUser).get(currentIP);
                    data.get(currentUser).put(currentIP,numberEntries+1);
                }

            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : data.entrySet()) {


            System.out.println(entry.getKey()+":");
            LinkedHashMap<String,Integer> info=entry.getValue();

            String ipOutput="";
            for (Map.Entry<String, Integer> ips : info.entrySet()) {
                ipOutput+=(ips.getKey()+" => "+ips.getValue());
                ipOutput+=", ";
            }

            ipOutput= ipOutput.substring(0,ipOutput.length()-2);
            ipOutput+=".";
            System.out.println(ipOutput);
        }

    }

}
