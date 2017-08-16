import java.util.ArrayDeque;
import java.util.Scanner;

public class TruckTour {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer stations = Integer.parseInt(sc.nextLine());

        ArrayDeque<Integer> stationNum = new ArrayDeque<>();

        ArrayDeque<Long> stationPetrol = new ArrayDeque<>();

        ArrayDeque<Long> stationDistance = new ArrayDeque<>();

        for (int i = 0; i < stations; i++) {

            String[] data =sc.nextLine().split(" ");
            stationNum.offer(i);
            stationPetrol.offer(Long.parseLong(data[0]));
            stationDistance.offer(Long.parseLong(data[1]));
        }

        Integer counter=0;

        Long petrol = 0L;
        Integer station=0;


        while (counter<stations){
            station=stationNum.peek();
            petrol=stationPetrol.peek();
            petrol-=stationDistance.peek();

            if (petrol>=0){
                stationNum.offer(stationNum.poll());
                stationPetrol.offer(stationPetrol.poll());
                stationDistance.offer(stationDistance.poll());
                counter=0;
                    while (petrol>=0 && counter < stations){

                        petrol+=stationPetrol.peek();
                        petrol-=stationDistance.peek();

                        stationNum.offer(stationNum.poll());
                        stationPetrol.offer(stationPetrol.poll());
                        stationDistance.offer(stationDistance.poll());

                        counter++;
                    }

            } else {
                stationNum.offer(stationNum.poll());
                stationPetrol.offer(stationPetrol.poll());
                stationDistance.offer(stationDistance.poll());
            }


        }

        System.out.println(station);
    }

}
