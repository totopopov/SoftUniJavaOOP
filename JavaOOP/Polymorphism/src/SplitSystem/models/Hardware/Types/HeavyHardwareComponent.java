package SplitSystem.models.Hardware.Types;

import SplitSystem.models.Hardware.HardwareComponent;

/**
 * Created by Todor Popov using Lenovo on 11.3.2017 г. at 16:21.
 */
public class HeavyHardwareComponent extends HardwareComponent {
    public HeavyHardwareComponent(String name,  int capacity, int memory) {
        super(name, "Heavy", capacity, memory);
    }

    @Override
    public int getCapacity() {
       return (super.getCapacity()*2);
    }

    @Override
    public int getMemory() {
        return super.getMemory()-(super.getMemory()/4);
    }
}
