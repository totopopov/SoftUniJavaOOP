package OOPBasicsExamPreparation.Models;

/**
 * Created by Todor Popov using Lenovo on 9.3.2017 г. at 17:19.
 */
public class LightSoftwareComponent extends SoftwareComponent{
    public LightSoftwareComponent(String name, int capacity, int memory) {
        super(name, capacity, memory);
        super.setType("LightSoftwareComponent");
    }
}
