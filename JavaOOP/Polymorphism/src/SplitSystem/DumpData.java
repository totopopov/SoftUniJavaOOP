package SplitSystem;

import SplitSystem.models.Hardware.HardwareComponent;


import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Todor Popov using Lenovo on 11.3.2017 г. at 18:31.
 */
public class DumpData {
    private HashMap<String, HardwareComponent> dumpData;

    public DumpData() {
        this.dumpData = new LinkedHashMap<>();
    }

    public void registerHardware(HardwareComponent hardwareComponent) {
        this.dumpData.putIfAbsent(hardwareComponent.getName(), hardwareComponent);
    }

    public HardwareComponent restoreHardwareComponent(String hardwareComponentName) {
        if (this.dumpData.containsKey(hardwareComponentName)) {
            HardwareComponent hardwareComponent = this.dumpData.get(hardwareComponentName);
            this.dumpData.remove(hardwareComponentName);
            return hardwareComponent;
        }
        return null;
    }

    public void destroy(String hardwareComponentName) {
        if (this.dumpData.containsKey(hardwareComponentName)) {
            this.dumpData.remove(hardwareComponentName);
        }
    }

    public String dumpAnalyze() {
        StringBuilder sb = new StringBuilder();

        sb.append("Dump Analysis\n")
                .append(String.format("Power Hardware Components: %d\n", this.getFilteredHardware("Power")))
                .append(String.format("Heavy Hardware Components: %d\n", this.getFilteredHardware("Heavy")))
                .append(String.format("Express Software Components: %d\n", this.getFilteredSoftwareCountSum("Express")))
                .append(String.format("Light Software Components: %d\n", this.getFilteredSoftwareCountSum("Light")))
                .append(String.format("Total Dumped Memory: %d\n", this.getDumpedMemory()))
                .append(String.format("Total Dumped Capacity: %d", this.getDumpedCapacity()));

        return sb.toString();
    }

    private int getFilteredHardware(String filterName) {
        return (int) this.dumpData.values().stream().filter(s -> s.getType().equals(filterName)).count();
    }

    private int getFilteredSoftwareCountSum(String filterName) {
        return this.dumpData.values().stream().mapToInt(s -> s.getFilteredSoftware(filterName)).sum();
    }

    private int getDumpedMemory() {
        return this.dumpData.values().stream().mapToInt(h -> h.getTakenMemory()).sum();
    }

    private int getDumpedCapacity() {
        return this.dumpData.values().stream().mapToInt(h -> h.getTakenCapacity()).sum();
    }


}
