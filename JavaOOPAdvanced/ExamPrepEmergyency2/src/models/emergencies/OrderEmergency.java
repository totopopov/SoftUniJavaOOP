package models.emergencies;

import enums.EmergencyLevel;
import enums.Status;
import utils.RegistrationTime;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:31.
 */
public class OrderEmergency extends  BaseEmergency {
    private Status status;

    public OrderEmergency(String description, EmergencyLevel emergencyLevel, RegistrationTime registrationTime, Status status) {
        super(description, emergencyLevel, registrationTime);
        this.status=status;
    }



    @Override
    public Integer ResultAfterProcessing() {
        return this.status.ordinal();
    }
}
