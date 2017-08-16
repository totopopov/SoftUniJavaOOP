package models.centers;

import enums.EmergencyLevel;
import models.emergencies.BaseEmergency;
import utils.RegistrationTime;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:48.
 */
public class MedicalServiceCenter extends BaseEmergencyCenter {

    public MedicalServiceCenter(String name, Integer amountOfMaximumEmergencies) {
        super(name, amountOfMaximumEmergencies);
    }

}
