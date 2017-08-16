package MilitaryElite;

import MilitaryElite.Interfaces.*;
import MilitaryElite.models.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 15:50.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer,Soldier> data=new LinkedHashMap<>();

        String input;

        while (!"End".equals(input=reader.readLine())){

            String[] tokens=input.split(" ");

            String type = tokens[0];
            int id=Integer.parseInt(tokens[1]);
            String firstName=tokens[2];
            String lastName=tokens[3];
            switch (type){
                case "Private":
                    Private privateSoldier=new PrivateImpl(id,firstName,lastName,getSalary(tokens));
                    data.putIfAbsent(privateSoldier.getId(),privateSoldier);
                    break;
                case "LeutenantGeneral":
                    LeutenantGeneral leutenantGeneral=new LeutenantGeneralImpl(id,firstName,lastName,getSalary(tokens));
                    for (int i = 5; i <tokens.length ; i++) {

                       int privateId=Integer.parseInt(tokens[i]);
                        leutenantGeneral.addPrivate((Private) data.get(privateId));

                    }
                    data.putIfAbsent(id,leutenantGeneral);

                    break;
                case "Engineer":

                    if (corpsIsRight(tokens)){

                        Engineer engineer=new EngineerImpl(id,firstName,lastName,getSalary(tokens),getCorps(tokens));
                        for (int i = 6; i <tokens.length ; i+=2) {

                            Repair repair = new RepairImpl(tokens[i], Integer.parseInt(tokens[i + 1]));

                            engineer.addPart(repair);

                        }

                        data.putIfAbsent(id,engineer);

                    }

                    break;
                case "Commando":
                    if (corpsIsRight(tokens)){

                        Commando commando=new CommandoImpl(id,firstName,lastName,getSalary(tokens),getCorps(tokens));
                        for (int i = 6; i <tokens.length ; i+=2) {

                            Mission mission = new MissionImpl(tokens[i], (tokens[i + 1]));

                            if (mission.getState()!=null){
                                commando.addMission(mission);
                            }
                        }
                        data.putIfAbsent(id,commando);
                    }
                    break;
                case "Spy":
                    int codeNumber=Integer.parseInt(tokens[4]);
                    Spy spy =new SpyImpl(id,firstName,lastName,codeNumber);
                    data.putIfAbsent(id,spy);
                    break;
            }

        }

        data.values().forEach(System.out::println);

    }

    private static boolean corpsIsRight(String[] tokens) {
       String corps=tokens[5];
        return corps.equals("Airforces") || corps.equals("Marines");
    }

    private static String getCorps(String[] tokens) {
      return tokens[5];
    }


    private static double getSalary(String[] tokens){
        return Double.parseDouble(tokens[4]);
    }
}
