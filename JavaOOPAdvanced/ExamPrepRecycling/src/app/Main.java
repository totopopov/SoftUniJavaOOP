package app;


import app.core.DataManager;
import app.core.Engine;
import app.interpreters.CommandInterpreter;
import app.interpreters.Interpreter;
import app.io.ConsoleReader;
import app.io.ConsoleWriter;
import app.io.Reader;
import app.io.Writer;
import app.models.waste.StorableWaste;
import app.waste_disposal.DefaultGarbageProcessor;
import app.waste_disposal.DefaultStrategyHolder;
import app.waste_disposal.contracts.*;


public class Main {


    public static void main(String[] args) {
        Reader reader=new ConsoleReader();
        Writer writer=new ConsoleWriter();
        StrategyHolder strategyHolder=new DefaultStrategyHolder();
        GarbageProcessor garbageProcessor=new DefaultGarbageProcessor(strategyHolder);
        DataManager dataManager=new DataManager(garbageProcessor);
        Interpreter interpreter=new CommandInterpreter(dataManager);
        Runnable engine = new Engine(reader,writer,interpreter);
        engine.run();
    }
//    public static void main1(String[] args) throws IOException {
//
//        Reader reader=new ConsoleReader();
//        Writer writer=new ConsoleWriter();
//        StrategyHolder strategyHolder=new DefaultStrategyHolder();
//
//        strategyHolder.addStrategy(Storable.class,new StorableStrategy());
//        strategyHolder.addStrategy(Recyclable.class,new RecyclableStrategy());
//        strategyHolder.addStrategy(Burnable.class,new BurnableStrategy());
//
//        GarbageProcessor processor = new DefaultGarbageProcessor(strategyHolder);
//
//        double energy=0;
//        double capital=0;
//
//        String input;
//
//        while (true){
//            input=reader.readln();
//            if ("TimeToRecycle".equals(input)){
//                break;
//            }
//            String[]params=input.split(" ");
//            String type=params[0];
//            switch (type){
//                case "ProcessGarbageCommand":
//                    String[] currentParams=params[1].split("\\|");
//                    Waste waste=InitializeWaste(currentParams);
//                    ProcessingData processingData = processor.processWaste(waste);
//                    energy+=processingData.getEnergyBalance();
//                    capital+=processingData.getCapitalBalance();
//                    try {
//                        if (waste != null) {
//                            writer.writeLn(String.format("%.2f kg of %s successfully processed!",waste.getWeight(),waste.getName()));
//                        }
//                    }catch (IllegalArgumentException e){
//                        writer.writeLn(e.getMessage());
//                    }
//                    break;
//                    case "StatusCommand":
//                        writer.writeLn(String.format("Energy: %.2f Capital: %.2f",energy,capital));
//                        break;
//            }
//        }
//
//    }
//
//    private static Waste InitializeWaste(String[] currentParams) {
//        String garbageType=currentParams[currentParams.length-1];
//        switch (garbageType){
//            case "Recyclable":
//                return new RecyclableWaste(currentParams[0],Double.parseDouble(currentParams[1]),Double.parseDouble(currentParams[2]));
//            case "Burnable":
//                return new BurnableWaste(currentParams[0],Double.parseDouble(currentParams[1]),Double.parseDouble(currentParams[2]));
//            case "Storable":
//                return new StorableWaste(currentParams[0],Double.parseDouble(currentParams[1]),Double.parseDouble(currentParams[2]));
//            default:
//                return null;
//        }
//    }

}
