package OOPBasicsExamPreparation.Models;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 * Created by Todor Popov using Lenovo on 9.3.2017 г. at 17:20.
 */
public abstract class HardwareComponent extends Component {
    private HashMap<String, SoftwareComponent> softwareComponents;
    private int takenCapacity;
    private int takenMemory;
    private String hardwareType;

    HardwareComponent(String name, int capacity, int memory) {
        super(name, capacity, memory);
        this.takenCapacity = 0;
        this.takenMemory = 0;
        this.softwareComponents = new LinkedHashMap<>();
        this.setWareType();
    }

    private void setTakenCapacity(int takenCapacity) {
        this.takenCapacity = takenCapacity;
    }

    protected void setHardwareType(String name) {
        this.hardwareType = name;
    }

    private void setTakenMemory(int takenMemory) {
        this.takenMemory = takenMemory;
    }

    public String getSoftwareComponents() {
        if (this.softwareComponents.isEmpty()) {
            return "None";
        }
        return this.softwareComponents.entrySet().stream()
                .map(s -> s.getValue().getName()).collect(Collectors.joining(", "));

    }

    public String getHardwareType() {
        return this.hardwareType;
    }

    public int getTakenCapacity() {
        return takenCapacity;
    }

    public int getTakenMemory() {
        return takenMemory;
    }

    public int getSoftwareSize() {
        return this.softwareComponents.size();
    }

    public String getExpressSoftware() {
        long count = this.softwareComponents.entrySet().stream()
                .filter(s -> s.getValue().getClass().getSimpleName().equals("ExpressSoftwareComponent")).count();

        return count == 0 ? "0" : String.valueOf(count);
    }

    public String getLightSoftware() {
        Long count = this.softwareComponents.entrySet().stream()
                .filter(s -> s.getValue().getClass().getSimpleName().equals("LightSoftwareComponent")).count();
        return count == 0 ? "0" : String.valueOf(count);
    }

    public void registerSoftwareComponent(SoftwareComponent softwareComponent) {
        if (this.getCapacity() - this.takenCapacity - softwareComponent.getCapacity() >= 0
                && this.getMemory() - this.takenMemory - softwareComponent.getMemory() >= 0) {
            this.softwareComponents.putIfAbsent(softwareComponent.getName(), softwareComponent);

            this.setTakenCapacity(this.takenCapacity + softwareComponent.getCapacity());
            this.setTakenMemory(this.takenMemory + softwareComponent.getMemory());
        }

    }

    public void releaseSoftware(String name) {
        if (this.softwareComponents.containsKey(name)) {
            this.softwareComponents.remove(name);
        }
    }

    protected abstract void setWareType();

}
