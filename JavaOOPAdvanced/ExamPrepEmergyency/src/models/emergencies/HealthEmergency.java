package models.emergencies;

import enums.EmergencyLevel;
import utils.RegistrationTime;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:31.
 */
public class HealthEmergency extends BaseEmergency {
    private Integer casualties;

    public HealthEmergency(String description, EmergencyLevel emergencyLevel, RegistrationTime registrationTime, Integer casualties) {
        super(description, emergencyLevel, registrationTime);
        this.casualties=casualties;
    }

    @Override
    public Integer ResultAfterProcessing() {
        return this.casualties;
    }
}
