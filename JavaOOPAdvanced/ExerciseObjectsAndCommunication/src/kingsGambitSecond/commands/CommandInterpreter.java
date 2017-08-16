package kingsGambitSecond.commands;

import kingsGambitSecond.contracts.AttackableGroup;

public class CommandInterpreter {

    public void executeCommand(String[] data, AttackableGroup attackableGroup) {

        String commandString = data[0];
        Command command = null;
        switch (commandString) {
            case "Kill":
                command = new Kill(data, attackableGroup);
                command.execute();
                break;
            case "Attack":
                command = new Attack(attackableGroup);
                command.execute();
                break;
        }

    }

}
