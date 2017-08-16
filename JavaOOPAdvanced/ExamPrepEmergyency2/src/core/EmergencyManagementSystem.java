package core;

import collection.EmergencyRegister;
import collection.Register;
import models.centers.EmergencyCenter;
import models.emergencies.Emergency;

import java.util.*;

public class EmergencyManagementSystem implements ManagementSystem {

    private static final String PROPERTY = "Property";
    private static final String HEALTH = "Health";
    private static final String ORDER = "Order";
    private static final String REGISTERED_PUBLIC_S_EMERGENCY_OF_LEVEL_S_AT_S = "Registered Public %s Emergency of level %s at %s.";
    private static final String REGISTERED_S_SERVICE_EMERGENCY_CENTER_S = "Registered %s Service Emergency Center - %s.";
    private static final String FIRE = "Fire";
    private static final String MEDICAL = "Medical";
    private static final String POLICE = "Police";
    private static final String SUCCESSFULLY_RESPONDED_TO_ALL_S_EMERGENCIES = "Successfully responded to all %s emergencies.";
    private static final String PRRM_SERVICES_LIVE_STATISTICS = "PRRM Services Live Statistics";
    private static final String FIRE_SERVICE_CENTERS_D = "Fire Service Centers: %d";
    private static final String MEDICAL_SERVICE_CENTERS_D = "Medical Service Centers: %d";
    private static final String POLICE_SERVICE_CENTERS_D = "Police Service Centers: %d";
    private static final String TOTAL_PROCESSED_EMERGENCIES_D = "Total Processed Emergencies: %d";
    private static final String CURRENTLY_REGISTERED_EMERGENCIES_D = "Currently Registered Emergencies: %d";
    private static final String TOTAL_PROPERTY_DAMAGE_FIXED_D = "Total Property Damage Fixed: %d";
    private static final String TOTAL_HEALTH_CASUALTIES_SAVED_D = "Total Health Casualties Saved: %d";
    private static final String TOTAL_SPECIAL_CASES_PROCESSED_D = "Total Special Cases Processed: %d";
    private static final String S_EMERGENCIES_LEFT_TO_PROCESS_D = "%s Emergencies left to process: %d";

    private Long totalEmergenciesProcessed;
    private Map<String, Register<Emergency>> emergencies;
    private Map<String, Register<EmergencyCenter>> emergencyCenters;
    private Map<String,Long> processedEmergencies;

    public EmergencyManagementSystem() {
        this.initializeEmergencies();
        this.initializeCenters();
        this.initializeProcessedEmergencies();
        this.totalEmergenciesProcessed=0L;
    }

    private void initializeProcessedEmergencies() {
        this.processedEmergencies=new HashMap<>();
        this.processedEmergencies.put(PROPERTY,0L);
        this.processedEmergencies.put(HEALTH,0L);
        this.processedEmergencies.put(ORDER,0L);
    }

    private void initializeCenters() {
        this.emergencyCenters=new HashMap<>();
        this.emergencyCenters.put(PROPERTY,new EmergencyRegister<>());
        this.emergencyCenters.put(HEALTH,new EmergencyRegister<>());
        this.emergencyCenters.put(ORDER,new EmergencyRegister<>());
    }

    private void initializeEmergencies() {
        this.emergencies=new HashMap<>();
        this.emergencies.put(PROPERTY,new EmergencyRegister<>());
        this.emergencies.put(HEALTH,new EmergencyRegister<>());
        this.emergencies.put(ORDER,new EmergencyRegister<>());
    }

    @Override
    public String registerPropertyEmergency(Emergency emergency) {
        this.emergencies.get(PROPERTY).enqueueEmergency(emergency);
        return String.format(REGISTERED_PUBLIC_S_EMERGENCY_OF_LEVEL_S_AT_S,PROPERTY,
                emergency.getEmergencyLevel(),emergency.getRegistrationTime());
    }

    @Override
    public String registerHealthEmergency(Emergency emergency) {
        this.emergencies.get(HEALTH).enqueueEmergency(emergency);
         return String.format(REGISTERED_PUBLIC_S_EMERGENCY_OF_LEVEL_S_AT_S,HEALTH,
                emergency.getEmergencyLevel(),emergency.getRegistrationTime());
    }

    @Override
    public String registerOrderEmergency(Emergency emergency) {
        this.emergencies.get(ORDER).enqueueEmergency(emergency);
        return String.format(REGISTERED_PUBLIC_S_EMERGENCY_OF_LEVEL_S_AT_S,ORDER,
                emergency.getEmergencyLevel(),emergency.getRegistrationTime());
    }

    @Override
    public String registerFireServiceCenter(EmergencyCenter emergencyCenter) {
        this.emergencyCenters.get(PROPERTY).enqueueEmergency(emergencyCenter);
        return String.format(REGISTERED_S_SERVICE_EMERGENCY_CENTER_S, FIRE,
                emergencyCenter.getName());
    }

    @Override
    public String registerMedicalServiceCenter(EmergencyCenter emergencyCenter) {
        this.emergencyCenters.get(HEALTH).enqueueEmergency(emergencyCenter);
        return String.format(REGISTERED_S_SERVICE_EMERGENCY_CENTER_S, MEDICAL,
                emergencyCenter.getName());
    }

    @Override
    public String registerPoliceServiceCenter(EmergencyCenter emergencyCenter) {
        this.emergencyCenters.get(ORDER).enqueueEmergency(emergencyCenter);
        return String.format(REGISTERED_S_SERVICE_EMERGENCY_CENTER_S, POLICE,
                emergencyCenter.getName());
    }

    @Override
    public String processEmergencies(String type) {
        Register<Emergency> emergenciesNeededProccessing = this.emergencies.get(type);
        Register<EmergencyCenter> emergencyCenters = this.emergencyCenters.get(type);

        while (!emergenciesNeededProccessing.isEmpty()){
            if (emergencyCenters.isEmpty()){
                return String.format(S_EMERGENCIES_LEFT_TO_PROCESS_D,type,emergenciesNeededProccessing.lenght());
            }

            EmergencyCenter currentCenter = emergencyCenters.dequeueEmergency();
            if (currentCenter.isForRetirement()) {
                continue;
            }

            Emergency currentEmergency=emergenciesNeededProccessing.dequeueEmergency();
            Long currentResult=this.processedEmergencies.get(type);
            this.processedEmergencies.put(type,currentResult+currentEmergency.ResultAfterProcessing());
            currentCenter.processEmergency();
            emergencyCenters.enqueueEmergency(currentCenter);
            this.totalEmergenciesProcessed++;

        }
        return String.format(
                SUCCESSFULLY_RESPONDED_TO_ALL_S_EMERGENCIES, type);
    }

    @Override
    public String emergencyReport() {

        for (Register<EmergencyCenter> emergencyCenterRegister : emergencyCenters.values()) {
            List<EmergencyCenter> centers=new LinkedList<>();

            while (!emergencyCenterRegister.isEmpty()){
                EmergencyCenter currentEC=emergencyCenterRegister.dequeueEmergency();
                if (currentEC.isForRetirement()){
                    continue;
                }
                centers.add(currentEC);

            }
            for (EmergencyCenter center : centers) {
                emergencyCenterRegister.enqueueEmergency(center);
            }
        }

        StringBuilder sb = new StringBuilder(PRRM_SERVICES_LIVE_STATISTICS);
        sb.append(System.lineSeparator());
        sb.append(String.format(FIRE_SERVICE_CENTERS_D,this.emergencyCenters.get(PROPERTY).lenght()));
        sb.append(System.lineSeparator());
        sb.append(String.format(MEDICAL_SERVICE_CENTERS_D,this.emergencyCenters.get(HEALTH).lenght()));
        sb.append(System.lineSeparator());
        sb.append(String.format(POLICE_SERVICE_CENTERS_D,this.emergencyCenters.get(ORDER).lenght()));
        sb.append(System.lineSeparator());
        sb.append(String.format(TOTAL_PROCESSED_EMERGENCIES_D,this.totalEmergenciesProcessed));
        sb.append(System.lineSeparator());
        sb.append(String.format(CURRENTLY_REGISTERED_EMERGENCIES_D,this.emergencies.entrySet().stream().mapToInt(e->e.getValue().lenght()).sum()));
        sb.append(System.lineSeparator());
        sb.append(String.format(TOTAL_PROPERTY_DAMAGE_FIXED_D,this.processedEmergencies.get(PROPERTY)));
        sb.append(System.lineSeparator());
        sb.append(String.format(TOTAL_HEALTH_CASUALTIES_SAVED_D,this.processedEmergencies.get(HEALTH)));
        sb.append(System.lineSeparator());
        sb.append(String.format(TOTAL_SPECIAL_CASES_PROCESSED_D,this.processedEmergencies.get(ORDER)));
        return sb.toString();
    }
}
