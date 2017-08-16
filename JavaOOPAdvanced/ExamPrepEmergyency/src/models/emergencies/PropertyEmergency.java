package models.emergencies;

import enums.EmergencyLevel;
import utils.RegistrationTime;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:32.
 */
public class PropertyEmergency extends BaseEmergency {
    private Integer damage;

    public PropertyEmergency(String description, EmergencyLevel emergencyLevel, RegistrationTime registrationTime, Integer damage) {
        super(description, emergencyLevel, registrationTime);
        this.damage=damage;
    }

    @Override
    public Integer ResultAfterProcessing() {
        return this.damage;
    }
}
