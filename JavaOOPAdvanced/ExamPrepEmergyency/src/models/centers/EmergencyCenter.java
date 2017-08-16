package models.centers;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:47.
 */
public interface EmergencyCenter {
    String getName();

    Integer getAmountOfMaximumEmergencies();

    Boolean isForRetirement();

    void processEmergency();
}
