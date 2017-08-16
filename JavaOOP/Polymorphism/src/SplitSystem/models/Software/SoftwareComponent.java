package SplitSystem.models.Software;

import SplitSystem.models.Component;

import java.util.HashMap;


/**
 * Created by Todor Popov using Lenovo on 11.3.2017 г. at 16:12.
 */
public abstract class SoftwareComponent extends Component {
    private int capacityConsumption;
    private int memoryConsumption;


    public SoftwareComponent(String name, String type, int capacity, int memory) {
        super(name, type);
        this.capacityConsumption=capacity;
        this.memoryConsumption=memory;
    }

    @Override
    public int getCapacity() {
        return this.capacityConsumption;
    }

    @Override
    public int getMemory() {
        return this.memoryConsumption;
    }

}
