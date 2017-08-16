package commands;

import core.ManagementSystem;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 0:59.
 */
public class EmergencyReportCommand extends BaseCommand {

    public EmergencyReportCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }

    @Override
    public String execute() {
        return super.getManagementSystem().emergencyReport();
    }
}
