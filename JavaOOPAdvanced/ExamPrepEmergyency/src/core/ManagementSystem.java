package core;

import models.centers.EmergencyCenter;
import models.emergencies.Emergency;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:01.
 */
public interface ManagementSystem {
    String registerPropertyEmergency(Emergency emergency);

    String registerHealthEmergency(Emergency emergency);

    String registerOrderEmergency(Emergency emergency);

    String registerFireServiceCenter(EmergencyCenter emergencyCenter);

    String registerMedicalServiceCenter(EmergencyCenter emergencyCenter);

    String registerPoliceServiceCenter(EmergencyCenter emergencyCenter);

    String processEmergencies(String type);

    String emergencyReport();
}
