package SplitSystem.models.Software.Types;

import SplitSystem.models.Software.SoftwareComponent;

/**
 * Created by Todor Popov using Lenovo on 11.3.2017 г. at 16:21.
 */
public class ExpressSoftwareComponent extends SoftwareComponent{
    public ExpressSoftwareComponent(String name, int capacity, int memory) {
        super(name, "Express", capacity, memory);
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }

    @Override
    public int getMemory() {
        return (super.getMemory()*2);
    }
}
