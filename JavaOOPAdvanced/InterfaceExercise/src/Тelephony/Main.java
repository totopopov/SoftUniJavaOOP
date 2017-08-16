package Тelephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SmartPhone smartPhone= new SmartPhone();

        String[] numbers = reader.readLine().split(" ");

        for (String number : numbers) {
            System.out.println(smartPhone.callOtherPhones(number));
        }

        String[] sites = reader.readLine().split(" ");

        for (String site : sites) {
            System.out.println(smartPhone.browseWebSites(site));
        }
    }
}
