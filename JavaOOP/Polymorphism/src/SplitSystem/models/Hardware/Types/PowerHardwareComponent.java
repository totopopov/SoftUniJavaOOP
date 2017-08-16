package SplitSystem.models.Hardware.Types;

import SplitSystem.models.Hardware.HardwareComponent;

/**
 * Created by Todor Popov using Lenovo on 11.3.2017 г. at 16:19.
 */
public class PowerHardwareComponent extends HardwareComponent{
    public PowerHardwareComponent(String name, int capacity, int memory) {
        super(name, "Power", capacity, memory);
    }

    @Override
    public int getCapacity() {
        return super.getCapacity()-((super.getCapacity()*3)/4);
    }

    @Override
    public int getMemory() {
        return super.getMemory()+((super.getMemory()*3)/4);
    }
}
