package models.emergencies;

import enums.EmergencyLevel;
import utils.RegistrationTime;

/**
 * Created by Todor Popov using Lenovo on 21.4.2017 г. at 23:52.
 */
public interface Emergency {
    String getDescription();

    EmergencyLevel getEmergencyLevel();

    RegistrationTime getRegistrationTime();

    Integer ResultAfterProcessing();
}
