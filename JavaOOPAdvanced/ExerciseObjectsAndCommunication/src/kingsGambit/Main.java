package kingsGambit;

import kingsGambit.commands.Command;
import kingsGambit.commands.CommandExecutor;
import kingsGambit.commands.Executor;
import kingsGambit.commands.specificCommands.AttackKing;
import kingsGambit.commands.specificCommands.KillUnit;
import kingsGambit.models.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 21:42.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CommandExecutor executor=new Executor();
        MilitaryAble military = new Military("Balkan");

        BaseUnit king=new King(reader.readLine());
        military.addUnit(king);

        String[] royalGuards = reader.readLine().split("\\s+");
        for (String guard : royalGuards) {
            BaseUnit royal=new RoyalGuard(guard);
            military.addUnit(royal);
        }

        String[] footmen = reader.readLine().split("\\s+");
        for (String man : footmen) {
            BaseUnit footman=new Footman(man);
            military.addUnit(footman);
        }

        String input;
        while (!"End".equals(input=reader.readLine())){

            String[] inputArgs = input.split("\\s+");
            String command=inputArgs[0];
            Command commands=null;
            switch (command){
                case "Kill":
                    commands=new KillUnit(military,inputArgs[1]);
                    break;
                case "Attack":
                    commands=new AttackKing(military);
                    break;
                    default:
                        break;
            }
            if (commands!=null){
                executor.executeCommand(commands);
            }
        }

    }
}
