package commands;

import annotations.InjectType;
import core.ManagementSystem;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 0:58.
 */
public class ProcessEmergenciesCommand extends BaseCommand {

    @InjectType
    private String type;

    public ProcessEmergenciesCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }



    @Override
    public String execute() {
       return super.getManagementSystem().processEmergencies(type);
    }
}
