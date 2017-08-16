import java.util.ArrayDeque;
import java.util.Scanner;

public class Robots {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(";");

        Long[] robotsTime = new Long[input.length];
        long[] robotsCurrTime = new long[input.length];
        String[] robotsName = new String[input.length];
        ArrayDeque<String> items = new ArrayDeque<>();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length; i++) {

            String[] nameRobot = input[i].split("-");
            robotsName[i] = nameRobot[0];
            robotsTime[i] = Long.parseLong(nameRobot[1]);
        }

        String[] timeInput = sc.nextLine().split(":");

        Long startTime = Long.parseLong(timeInput[2]) + 60 * (Long.parseLong(timeInput[1]) + 60 * Long.parseLong(timeInput[0]));


        String itemsInput = "";

        while (!("End").equals(itemsInput=sc.nextLine())) {
            items.offer(itemsInput);
        }

        while (!items.isEmpty()) {

            boolean takenItem = false;

            startTime++;

            for (int i = 0; i < robotsTime.length; i++) {

                if (robotsCurrTime[i] == 0 && !takenItem) {

                    robotsCurrTime[i] = robotsTime[i];

                    String takenTime = getTime(startTime);


                    output.append(String.format("%s - %s [%s]%n", robotsName[i], items.pop(), takenTime));

                    // output.append(String.format(robotsName[i] + " - " + items.pop() +" [" +takenTime+"]"));
                    //output.append(" - ");
                    //output.append(items.pop());
                    //output.append(" [");
                    //output.append(takenTime);
                    //output.append("]");
//                    System.out.printf();
                    // System.out.println(robotsName[i] + " - " + items.pop() +" [" +takenTime+"]");

                    takenItem = true;
                }

                if (robotsCurrTime[i] > 0) {
                    robotsCurrTime[i]--;
                }
            }

            if (!takenItem) {
                items.offer(items.poll());
            }
        }
        System.out.println(output.toString());
    }

    private static String getTime(Long time) {

//        Long days = time/(86400);
//
//        time=time-days*(86400);
//
//        Long hours=time/(3600);
//
//        time=time-hours*(3600);
//
//        Long mins=time/60;
//
//        Long secs=time-mins*60;

        long hours = (time / (60 * 60)) % 24;
        long m = (time / 60) % 60;
        long s = time % 60;


        return String.format("%02d:%02d:%02d", hours, m, s);

    }

}