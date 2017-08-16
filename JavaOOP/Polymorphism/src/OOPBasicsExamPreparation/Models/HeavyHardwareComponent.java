package OOPBasicsExamPreparation.Models;

/**
 * Created by Todor Popov using Lenovo on 9.3.2017 г. at 17:19.
 */
public class HeavyHardwareComponent extends HardwareComponent {
    public HeavyHardwareComponent(String name, int capacity, int memory) {
        super(name,capacity, memory);
        super.setType("HeavyHardwareComponent");
    }

    @Override
    protected void setWareType() {
        super.setHardwareType("Heavy");
    }


    @Override
    protected void setCapacity(int capacity) {
        super.setCapacity(2*capacity);
    }

    @Override
    protected void setMemory(int memory) {
        super.setMemory(memory-(memory/4));
    }
}
