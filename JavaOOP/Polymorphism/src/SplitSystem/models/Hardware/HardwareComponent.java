package SplitSystem.models.Hardware;

import SplitSystem.models.Component;
import SplitSystem.models.Software.SoftwareComponent;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 * Created by Todor Popov using Lenovo on 11.3.2017 г. at 16:12.
 */
public abstract class HardwareComponent extends Component {
    private HashMap<String, SoftwareComponent> softwareComponents;
    private int capacity;
    private int memory;

    public HardwareComponent(String name, String type, int capacity, int memory) {
        super(name, type);
        this.softwareComponents=new LinkedHashMap<>();
        this.capacity=capacity;
        this.memory=memory;
    }

    @Override
    public int getCapacity() {
      return this.capacity;
    }

    @Override
    public int getMemory() {
        return this.memory;
    }

    public void registerSoftwareComponent(SoftwareComponent softwareComponent){
        if (this.getAvailableMemory()>=softwareComponent.getMemory() &&
                this.getAvailableCapacity()>=softwareComponent.getCapacity())
        this.softwareComponents.putIfAbsent(softwareComponent.getName(),softwareComponent);
    }

    public void releaseSoftwareComponent(String softName){
       if (this.softwareComponents.containsKey(softName)){
           this.softwareComponents.remove(softName);
       }
    }

    public int getAvailableMemory(){
       return this.getMemory()-this.getTakenMemory();
    }

    public int getAvailableCapacity(){
        return this.getCapacity()-this.getTakenCapacity();
    }

    public int getTakenMemory(){
        return this.softwareComponents.values().stream().mapToInt(s->s.getMemory()).sum();
    }

    public int getTakenCapacity(){
        return this.softwareComponents.values().stream().mapToInt(s->s.getCapacity()).sum();
    }

    public int getSoftwareSize() {
        return this.softwareComponents.size();
    }

    public int getFilteredSoftware(String filterName) {
        return (int)this.softwareComponents.values().stream().filter(s->s.getType().equals(filterName)).count();
    }

    public String getSoftwareComponentsNames() {
        String output=this.softwareComponents.values().stream().map(s->s.getName()).collect(Collectors.joining(", "));

        return output.length()>0?output:"None";
    }
}
