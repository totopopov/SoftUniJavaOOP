package PrepExam1;

import java.util.Scanner;



public class hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayOftreatment=Integer.parseInt(scanner.nextLine());

        int treatedPatient=0;
        int untreatedPatient=0;
        int doctors=7;


        for (int i = 1; i <= dayOftreatment; i++) {
            int currentPatients=Integer.parseInt(scanner.nextLine());

            if (i%3==0 && untreatedPatient>treatedPatient){
                doctors++;
            }
            if (currentPatients<=doctors){
                treatedPatient+=currentPatients;
            }else {
                treatedPatient+=doctors;
                untreatedPatient+=currentPatients-doctors;
            }
        }

        System.out.printf("Treated patients: %d.",treatedPatient);
        System.out.println();
        System.out.printf("Untreated patients: %d.",untreatedPatient);


    }
}
