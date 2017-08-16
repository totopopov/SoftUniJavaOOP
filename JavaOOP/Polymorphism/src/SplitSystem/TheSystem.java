package SplitSystem;

import SplitSystem.models.Hardware.HardwareComponent;
import SplitSystem.models.Hardware.Types.HeavyHardwareComponent;
import SplitSystem.models.Hardware.Types.PowerHardwareComponent;
import SplitSystem.models.Software.Types.ExpressSoftwareComponent;
import SplitSystem.models.Software.Types.LightSoftwareComponent;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Todor Popov using Lenovo on 11.3.2017 г. at 16:49.
 */
public class TheSystem {
    private HashMap<String,HardwareComponent> hardwareComponents;

    public TheSystem() {
        this.hardwareComponents = new LinkedHashMap<>();
    }

    public void registerPowerHardware(String name, int capacity, int memory){
        PowerHardwareComponent hardwareComponent=new PowerHardwareComponent(name,capacity,memory);
        this.hardwareComponents.putIfAbsent(hardwareComponent.getName(),hardwareComponent);
    }
	public void registerHeavyHardware(String name, int capacity, int memory){
        HeavyHardwareComponent heavyHardwareComponent=new HeavyHardwareComponent(name,capacity,memory);
        this.hardwareComponents.putIfAbsent(heavyHardwareComponent.getName(),heavyHardwareComponent);
    }
    public void registerExpressSoftware(String hardwareComponentName, String name, int capacity, int memory){
	    if (this.hardwareComponents.containsKey(hardwareComponentName)){
            ExpressSoftwareComponent expressSoftwareComponent=new ExpressSoftwareComponent(name,capacity,memory);
            this.hardwareComponents.get(hardwareComponentName).registerSoftwareComponent(expressSoftwareComponent);
        }

    }
    public 	void registerLightSoftware(String hardwareComponentName, String name, int capacity, int memory){
        if (this.hardwareComponents.containsKey(hardwareComponentName)){
            LightSoftwareComponent lightSoftwareComponent=new LightSoftwareComponent(name,capacity,memory);
            this.hardwareComponents.get(hardwareComponentName).registerSoftwareComponent(lightSoftwareComponent);
        }
    }

	public void releaseSoftwareComponent(String hardwareComponentName, String softwareComponentName){
        if (this.hardwareComponents.containsKey(hardwareComponentName)){
            this.hardwareComponents.get(hardwareComponentName).releaseSoftwareComponent(softwareComponentName);
        }
    }

    public String analyze(){
        StringBuilder sb = new StringBuilder();
        sb.append("System Analysis\n");
        sb.append(String.format("Hardware Components: %d\n",this.hardwareComponents.size()));
        sb.append(String.format("Software Components: %d\n",this.hardwareComponents.
                entrySet().stream().mapToInt(k->k.getValue().getSoftwareSize()).sum()));
        sb.append(String.format("Total Operational Memory: %d / %d\n",
                this.hardwareComponents.entrySet().stream().mapToInt(s->s.getValue().getTakenMemory()).sum()
                ,this.hardwareComponents.entrySet().stream().mapToInt(h->h.getValue().getMemory()).sum()
        ));
        sb.append(String.format("Total Capacity Taken: %d / %d",
                this.hardwareComponents.entrySet().stream().mapToInt(s->s.getValue().getTakenCapacity()).sum()
                ,this.hardwareComponents.entrySet().stream().mapToInt(h->h.getValue().getCapacity()).sum()
        ));

        return sb.toString();
    }
	public String split(){
        StringBuilder sb=new StringBuilder();

        this.hardwareComponents.entrySet().stream()
                .sorted((h1,h2)->h2.getValue().getType().compareTo(h1.getValue().getType()))
                .forEach(entry-> {
                    sb.append(String.format("Hardware Component - %s\n", entry.getKey()));
                    sb.append(String.format("Express Software Components - %d\n", entry.getValue().getFilteredSoftware("Express")));
                    sb.append(String.format("Light Software Components - %d\n", entry.getValue().getFilteredSoftware("Light")));
                    sb.append(String.format("Memory Usage: %d / %d\n", entry.getValue().getTakenMemory(), entry.getValue().getMemory()));
                    sb.append(String.format("Capacity Usage: %d / %d\n", entry.getValue().getTakenCapacity(), entry.getValue().getCapacity()));
                    sb.append(String.format("Type: %s\n", entry.getValue().getType()));
                    sb.append(String.format("Software Components: %s\n", entry.getValue().getSoftwareComponentsNames()));
                });
   return sb.toString();
    }

    public HardwareComponent dumpHardwareComponent(String hardwareComponentName){
	    if (this.hardwareComponents.containsKey(hardwareComponentName)){
            HardwareComponent hardwareComponent=this.hardwareComponents.get(hardwareComponentName);
            this.hardwareComponents.remove(hardwareComponentName);
            return hardwareComponent;
        }
        return null;
    }
    public void registerHardwareComponent(HardwareComponent hardwareComponent){
        this.hardwareComponents.putIfAbsent(hardwareComponent.getName(),hardwareComponent);
    }


}
