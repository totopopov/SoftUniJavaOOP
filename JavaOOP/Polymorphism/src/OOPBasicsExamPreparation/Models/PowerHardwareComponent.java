package OOPBasicsExamPreparation.Models;

/**
 * Created by Todor Popov using Lenovo on 9.3.2017 г. at 17:19.
 */
public class PowerHardwareComponent extends HardwareComponent {
    public PowerHardwareComponent(String name, int capacity, int memory) {
        super(name, capacity, memory);
        super.setType("PowerHardwareComponent");
    }

    @Override
    protected void setWareType() {
        super.setHardwareType("Power");
    }

    @Override
    protected void setCapacity(int capacity) {
        super.setCapacity(capacity-(capacity*3)/4);
    }

    @Override
    protected void setMemory(int memory) {
        super.setMemory(memory+(memory*3)/4);
    }
}
