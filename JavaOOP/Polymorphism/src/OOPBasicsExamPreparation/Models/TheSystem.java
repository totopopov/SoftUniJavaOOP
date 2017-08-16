package OOPBasicsExamPreparation.Models;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Created by Todor Popov using Lenovo on 9.3.2017 г. at 17:57.
 */
public class TheSystem {
    private HashMap<String,HardwareComponent> hardwareComponents;

    public TheSystem() {
        this.hardwareComponents = new LinkedHashMap<>();
    }

    private void registerHardware(HardwareComponent hardwareComponent){
        this.hardwareComponents.putIfAbsent(hardwareComponent.getName(),hardwareComponent);
    }

    public void registerPowerHardware(String name, int capacity, int memory){
        PowerHardwareComponent powerHardwareComponent=new PowerHardwareComponent(name,capacity,memory);
        this.registerHardware(powerHardwareComponent);
    }

    public void registerHeavyHardware(String name, int capacity, int memory){
        HeavyHardwareComponent heavyHardwareComponent=new HeavyHardwareComponent(name,capacity,memory);
        this.registerHardware(heavyHardwareComponent);
    }

    public void registerExpressSoftware(String hardwareComponentName, String name, int capacity, int memory){
        if (this.hardwareComponents.containsKey(hardwareComponentName)){
            ExpressSoftwareComponent expressSoftwareComponent=new ExpressSoftwareComponent(name,capacity,memory);
            this.hardwareComponents.get(hardwareComponentName).registerSoftwareComponent(expressSoftwareComponent);
        }
    }

    public void registerLightSoftware(String hardwareComponentName, String name, int capacity, int memory){
        if (this.hardwareComponents.containsKey(hardwareComponentName)){
            LightSoftwareComponent lightSoftwareComponent=new LightSoftwareComponent(name,capacity,memory);
            this.hardwareComponents.get(hardwareComponentName).registerSoftwareComponent(lightSoftwareComponent);
        }
    }

    public void releaseSoftwareComponent(String hardwareComponentName, String softwareComponentName){
        if (this.hardwareComponents.containsKey(hardwareComponentName)){
            this.hardwareComponents.get(hardwareComponentName).releaseSoftware(softwareComponentName);
        }
    }

    public String analyze(){
        StringBuilder sb = new StringBuilder();
        sb.append("System Analysis\n");
        sb.append(String.format("Hardware Components: %d\n",this.hardwareComponents.size()));
        sb.append(String.format("Software Components: %d\n",this.hardwareComponents.
                entrySet().stream().mapToInt(k->k.getValue().getSoftwareSize()).sum()));
        sb.append(String.format("Total Operational Memory: %d/%d\n",
                this.hardwareComponents.entrySet().stream().mapToInt(s->s.getValue().getTakenMemory()).sum()
                ,this.hardwareComponents.entrySet().stream().mapToInt(h->h.getValue().getMemory()).sum()
        ));
        sb.append(String.format("Total Capacity Taken: %d/%d\n",
                this.hardwareComponents.entrySet().stream().mapToInt(s->s.getValue().getTakenCapacity()).sum()
               ,this.hardwareComponents.entrySet().stream().mapToInt(h->h.getValue().getCapacity()).sum()
        ));

        return sb.toString();
    }

    public String split(){
        StringBuilder sb=new StringBuilder();

        this.hardwareComponents.entrySet().stream()
                .sorted((h1,h2)->h2.getValue().getHardwareType().compareTo(h1.getValue().getHardwareType()))
                .forEach(entry-> {
            sb.append(String.format("Hardware Component – %s\n", entry.getKey()));
            sb.append(String.format("Express Software Components: %s\n", entry.getValue().getExpressSoftware()));
            sb.append(String.format("Light Software Components: %s\n", entry.getValue().getLightSoftware()));
            sb.append(String.format("Memory Usage: %d/%d\n", entry.getValue().getTakenMemory(), entry.getValue().getMemory()));
            sb.append(String.format("Capacity Usage: %d/%d\n", entry.getValue().getTakenCapacity(), entry.getValue().getCapacity()));
            sb.append(String.format("Type: %s\n", entry.getValue().getHardwareType()));
            sb.append(String.format("Software Components: %s\n", entry.getValue().getSoftwareComponents()));
        });

        return sb.toString();
    }

}
