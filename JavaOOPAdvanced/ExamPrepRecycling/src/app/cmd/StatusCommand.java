package app.cmd;


import app.conntacts.DataManagerAble;

public class StatusCommand extends BaseCommand {


    protected StatusCommand(DataManagerAble datamanager) {
        super(datamanager);
    }

    @Override
    public String execute() {
        return String.format("Energy: %.2f Capital: %.2f",super.getDatamanager().getEnergy(),super.getDatamanager().getCapital());
    }
}
