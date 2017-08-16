package commands;

import annotations.InjectArgs;
import core.ManagementSystem;
import models.centers.EmergencyCenter;
import models.centers.FiremanServiceCenter;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:00.
 */
public class RegisterPoliceServiceCenterCommand extends BaseCommand{

    @InjectArgs
    private String[] params;
    private EmergencyCenter emergencyCenter;


    public RegisterPoliceServiceCenterCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }


    @Override
    public String execute() {
        String name= this.params[1];
        Integer amountOfEmergencies = Integer.valueOf(this.params[2]);
        this.emergencyCenter=new FiremanServiceCenter(name,amountOfEmergencies);
        return super.getManagementSystem().registerPoliceServiceCenter(this.emergencyCenter);
    }
}
