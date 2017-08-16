package OOPBasicsExamPreparation;


import OOPBasicsExamPreparation.Models.TheSystem;

public class Main {
    public static void main(String[] args) {


        TheSystem system=new TheSystem();

        system.registerPowerHardware("HDD",200,200);
        system.registerHeavyHardware("SSD",400,400);

        System.out.println(system.analyze());

        system.registerLightSoftware("HDD","Test",0,10);
        system.registerExpressSoftware("HDD","Test2",100,100);
        system.registerExpressSoftware("HDD","Test3",50,100);
        system.registerLightSoftware("SDD","Windows",20,50);
        system.registerExpressSoftware("SSD","Linux",50,100);
        system.registerLightSoftware("SDD","Unix",20,50);
        System.out.println(system.analyze());
        system.releaseSoftwareComponent("SSD","Linux");
        System.out.println(system.split());

    }
}
