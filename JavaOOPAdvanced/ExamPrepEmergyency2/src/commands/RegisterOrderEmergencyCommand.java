package commands;

import annotations.InjectArgs;
import core.ManagementSystem;
import enums.EmergencyLevel;
import enums.Status;
import models.emergencies.Emergency;
import models.emergencies.OrderEmergency;
import models.emergencies.PropertyEmergency;
import utils.RegistrationTime;
import utils.RegistrationTimeImpl;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:00.
 */
public class RegisterOrderEmergencyCommand extends BaseCommand {

    @InjectArgs
    private String[] params;
    private Emergency emergency;
    private RegistrationTime registrationTime;


    public RegisterOrderEmergencyCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }

    @Override
    public String execute() {
        String description=this.params[1];
        EmergencyLevel level =EmergencyLevel.valueOf(this.params[2].toUpperCase());
        this.setRegistrationTime(this.params[3]);
        Status status=this.setStatus(this.params[4]);
        this.emergency=new OrderEmergency(description,level,this.registrationTime,status);
        return super.getManagementSystem().registerOrderEmergency(this.emergency);
    }

    private Status setStatus(String status){
        switch (status){
            case "Special":
                return Status.SPECIAL;
            case "Non-Special":
                return Status.NON_SPECIAL;
            default:
                throw new IllegalArgumentException("Not supported Status");
        }}



    private void setRegistrationTime(String time) {
        this.registrationTime = new RegistrationTimeImpl(time);
    }
}
