package commands;

import core.ManagementSystem;



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
