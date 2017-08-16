import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.regex.Pattern;
public class RobotsOptimised {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String[] input = sc.nextLine().split(Pattern.quote(";"));

        int[][] robotsTime=new int[input.length][2];
        String [] robotsName=new String[input.length];

       // StringBuilder output = new StringBuilder();

        ArrayDeque<String> items = new ArrayDeque<>();

        for (int i = 0; i <input.length ; i++) {


            String robot=input[i].split(Pattern.quote("-"))[0];
            int time=Integer.parseInt(input[i].split(Pattern.quote("-"))[1]);

            robotsName[i]=robot;
            robotsTime[i][0]=time;
            robotsTime[i][1]=0;
        }

        String[] timeInput = sc.nextLine().split(Pattern.quote(":"));

        int starttime=Integer.parseInt(timeInput[2])+60*(Integer.parseInt(timeInput[1])+60*Integer.parseInt(timeInput[0]) );


        String itemsInput="";

        while (!("End").equals(itemsInput=sc.nextLine())){
            items.offer(itemsInput);
        }



        while (!items.isEmpty()){

            boolean takenItem=false;

            starttime++;

            for (int i = 0; i <robotsName.length ; i++) {

                if (robotsTime[i][1]==0 && !takenItem){

                    robotsTime[i][1]=robotsTime[i][0];

                    String takenTime=getTime(starttime);

                    //output.append(String.format("%s - %s [%s]%n",robotsName[i],items.pop(),takenTime));

                    System.out.println(robotsName[i] + " - " + items.pop() +" [" +takenTime+"]");
                    takenItem=true;

                }

                if (robotsTime[i][1]>0){
                    robotsTime[i][1]--;
                }

            }

            if (!takenItem){
                items.offer(items.poll());
            }

        }

  //      System.out.println(output.toString());

    }

    private static String getTime(int time) {

        int days = time/(86400);

        time=time-days*(86400);

        int hours=time/(3600);

        time=time-hours*(3600);

        int mins=time/60;

        int secs=time-mins*60;
        return String.format("%02d:%02d:%02d",hours,mins,secs);


    }

}
