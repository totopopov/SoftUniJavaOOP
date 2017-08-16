package SplitSystem.models.Software.Types;

import SplitSystem.models.Software.SoftwareComponent;

/**
 * Created by Todor Popov using Lenovo on 11.3.2017 г. at 16:21.
 */
public class LightSoftwareComponent extends SoftwareComponent{
    public LightSoftwareComponent(String name,  int capacity, int memory) {
        super(name, "Light", capacity, memory);
    }

    @Override
    public int getCapacity() {
        return super.getCapacity()+(super.getCapacity()/2);
    }

    @Override
    public int getMemory() {
        return super.getMemory()-(super.getMemory()/2);
    }
}
