package infernoInfinity;

import infernoInfinity.weapons.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Todor Popov using Lenovo on 27.3.2017 г. at 18:13.
 */
public class Main {
    public static void main(String[] args) throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Map<String,WeaponAble> data=new LinkedHashMap<>();

        String input;

        while (!"END".equals(input=reader.readLine())){

            String[] tokens=input.split(";");

           String command= tokens[0];

           switch (command){
               case "Create":
                   String type =tokens[1];
                   WeaponAble weapon=null;
                   switch (type.toUpperCase()){
                       case "AXE":
                           weapon=new Axe(tokens[2]);
                           break;
                       case "SWORD":
                           weapon=new Sword(tokens[2]);
                           break;
                       case "KNIFE":
                           weapon=new Knife(tokens[2]);
                           break;
                   }
                   if (weapon!=null){
                       data.putIfAbsent(weapon.getName(),weapon);
                   }
                   break;
               case "Add":
                    if (data.containsKey(tokens[1])){

                        Gem gem=Gem.valueOf(tokens[3].toUpperCase());
                        int socket=Integer.parseInt(tokens[2]);

                        data.get(tokens[1]).addGems(gem,socket);
                    }
                   break;
               case "Remove":
                   if (data.containsKey(tokens[1])) {
                       int removeSocket=Integer.parseInt(tokens[2]);
                   data.get(tokens[1]).removeGems(removeSocket);
                   }
                   break;
               case "Print":
                   if (data.containsKey(tokens[1])) {
                       System.out.println(data.get(tokens[1]));
                   }
                   break;
               case "Compare":
                   if (data.containsKey(tokens[1])&&data.containsKey(tokens[2])){
                       WeaponAble firstWeapon=data.get(tokens[1]);
                       WeaponAble secondWeapon=data.get(tokens[2]);
                       System.out.println(firstWeapon.compareTo(secondWeapon)>0?
                               firstWeapon.comparedString():secondWeapon.comparedString());
                   }
                   break;
               case "Author":
                   System.out.println("Author: " + Weapon.class.getAnnotation(Information.class).author());
                   break;
               case "Revision":
                   System.out.println("Revision: " + Weapon.class.getAnnotation(Information.class).revision());
                   break;
               case "Description":
                   System.out.println("Class description: " + Weapon.class.getAnnotation(Information.class).description());
                   break;
               case "Reviewers":
                   System.out.println(String.format("Reviewers: %s", String.join(", ",
                           Weapon.class.getAnnotation(Information.class).reviewers())));
                   break;
           }

        }

    }
}
