package commands;

import core.ManagementSystem;
import models.emergencies.Emergency;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 0:58.
 */
public abstract class BaseCommand implements Executable {


    private ManagementSystem managementSystem;

    protected BaseCommand(ManagementSystem managementSystem) {
        this.managementSystem=managementSystem;
    }

    @Override
    public abstract String execute();

    protected ManagementSystem getManagementSystem() {
        return managementSystem;
    }
}
