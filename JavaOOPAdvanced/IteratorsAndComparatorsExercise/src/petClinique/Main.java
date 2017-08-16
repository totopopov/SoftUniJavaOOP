package petClinique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 20:44.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ClinicManagerAble clinicsManager=new ClinicManager();

        int lines=Integer.parseInt(reader.readLine());

        for (int i = 0; i < lines; i++) {
            String[] input =reader.readLine().split(" ");
            try {
                switch (input[0]) {
                    case "Create":
                        switch (input[1]) {
                            case "Pet":
                                clinicsManager.createPet(input[2], Integer.parseInt(input[3]), input[4]);
                                break;
                            case "Clinic":
                                clinicsManager.createClinic(input[2], Integer.parseInt(input[3]));
                                break;
                        }

                        break;
                    case "HasEmptyRooms":
                        clinicsManager.hasEmptyRoomsInClinic(input[1]);
                        break;
                    case "Release":
                        System.out.println(clinicsManager.releasePet(input[1]));
                        break;
                    case "Print":
                        if (input.length==2){
                            clinicsManager.print(input[1]);
                        } else {
                            clinicsManager.print(input[1], Integer.parseInt(input[2]));
                        }
                        break;
                    case "Add":
                        System.out.println(clinicsManager.add(input[1], input[2]));
                        break;
                }

            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }

        }




    }
}
