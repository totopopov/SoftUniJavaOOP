package OOPBasicsExamPreparation.Models;

/**
 * Created by Todor Popov using Lenovo on 9.3.2017 г. at 17:10.
 */

public abstract class Component {
    private String name;
    private String type;
    private int memory;
    private int capacity;

     Component(String name, int capacity, int memory) {
        this.setName(name);
        this.setMemory(memory);
        this.setCapacity(capacity);
    }

    public String getName(){
         return this.name;
    };

    private void setName(String name) {
        this.name=name;
    }

    public final String getType() {
        return this.type;
    }

    protected void setType(String type) {
        this.type=type;
    }

    public final int getCapacity() {
        return capacity;
    }

    protected void setCapacity(int capacity) {

//         switch (getType()){
//             case"PowerHardwareComponent":
//                 this.setMemory(this.getMemory()+(this.getMemory()*3)/4);
//                 this.setCapacity(this.getCapacity() - (this.getCapacity()*3)/4 );
//                 break;
//             case"HeavyHardwareComponent":
//                 this.setMemory(this.getMemory()-(this.getMemory()*3)/4);
//                 this.setCapacity(this.getCapacity() +(this.getCapacity()*3)/4 );
//                 break;
//         }

        this.capacity = capacity;
    }


    public final int getMemory() {
        return this.memory;
    }

    protected void setMemory(int memory) {
        this.memory = memory;
    }
}
