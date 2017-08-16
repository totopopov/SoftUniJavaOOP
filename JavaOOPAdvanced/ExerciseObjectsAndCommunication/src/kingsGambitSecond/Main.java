package kingsGambitSecond;

import kingsGambitSecond.commands.*;
import kingsGambitSecond.contracts.AttackableGroup;
import kingsGambitSecond.groups.AttackableGroupImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] kingName = reader.readLine().split("\\s+");
        String[] royalGuardsName = reader.readLine().split("\\s+");
        String[] footmenNames = reader.readLine().split("\\s+");
        AttackableGroup attackableGroup = new AttackableGroupImpl();
        Command addKing = new AddKing(kingName, attackableGroup);
        addKing.execute();
        Command addRoaylGuards = new AddRoyalGuard(royalGuardsName, attackableGroup);
        addRoaylGuards.execute();
        Command addFootmen = new AddFootmen(footmenNames, attackableGroup);
        addFootmen.execute();

        String[] tokens = reader.readLine().split("\\s+");
        CommandInterpreter commandInterpreter = new CommandInterpreter();
        while (true) {
            if(tokens[0].equals("End")) {
                break;
            }
            commandInterpreter.executeCommand(tokens, attackableGroup);
            tokens = reader.readLine().split("\\s+");

        }

    }
}
