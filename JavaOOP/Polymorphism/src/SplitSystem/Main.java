package SplitSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 11.3.2017 г. at 16:07.
 */
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TheSystem system=new TheSystem();
        DumpData dumpData=new DumpData();

        String input;

        while (!"System Split".equals(input=reader.readLine())){

            String[] inputTokens=input.split("\\(");
            String[] arGs=inputTokens[1].substring(0,inputTokens[1].length()-1).split(", ");
            switch (inputTokens[0]){
                case "RegisterPowerHardware":
                    system.registerPowerHardware(arGs[0],Integer.parseInt(arGs[1]),Integer.parseInt(arGs[2]));
                    break;
                case "RegisterHeavyHardware":
                    system.registerHeavyHardware(arGs[0],Integer.parseInt(arGs[1]),Integer.parseInt(arGs[2]));
                    break;
                case "RegisterLightSoftware":
                    system.registerLightSoftware(arGs[0],arGs[1],Integer.parseInt(arGs[2]),Integer.parseInt(arGs[3]));
                    break;
                case "RegisterExpressSoftware":
                    system.registerExpressSoftware(arGs[0],arGs[1],Integer.parseInt(arGs[2]),Integer.parseInt(arGs[3]));
                    break;
                case "ReleaseSoftwareComponent":
                    system.releaseSoftwareComponent(arGs[0],arGs[1]);
                    break;
                case "Analyze":
                    System.out.println(system.analyze());
                    break;
                case "Dump":
                   dumpData.registerHardware(system.dumpHardwareComponent(arGs[0]));
                    break;
                case "Destroy":
                    dumpData.destroy(arGs[0]);
                    break;
                case "Restore":
                    system.registerHardwareComponent(dumpData.restoreHardwareComponent(arGs[0]));
                    break;
                case "DumpAnalyze":
                    System.out.println(dumpData.dumpAnalyze());
                    break;
            }
        }

        System.out.println(system.split());
    }
}
