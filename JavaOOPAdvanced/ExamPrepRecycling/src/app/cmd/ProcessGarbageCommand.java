package app.cmd;

import app.annotations.InjectParams;
import app.annotations.Recyclable;
import app.conntacts.DataManagerAble;
import app.conntacts.Executable;
import app.waste_disposal.annotations.Disposable;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 5:13.
 */
public class ProcessGarbageCommand extends BaseCommand {


    @InjectParams
    private String params;
    private Waste waste;
    private GarbageDisposalStrategy disposalStrategy;
    private Class strategyAnnotation;
    private final Map<Class<?>,Class<?>> mapeer=new HashMap<Class<?>,Class<?>>(){{
        put(int.class,Integer.class);
        put(double.class,Double.class);
        put(long.class,Long.class);
        put(float.class,Float.class);
    }};

    public ProcessGarbageCommand(DataManagerAble datamanager) {
        super(datamanager);
    }

    @Override
    public String execute() {
            this.waste = wasteCreater(params);
        Annotation[] annotations = this.waste.getClass().getAnnotations();
        this.strategyAnnotation = null;
        for (Annotation annotation : annotations) {
            if(annotation.annotationType().isAnnotationPresent(Disposable.class)){
                this.strategyAnnotation = annotation.annotationType();
                break;
        }
        if (strategyAnnotation==null){
            throw new IllegalArgumentException("No annotation Present");
            }
        }

        this.disposalStrategy=strategyCreater(params,this.strategyAnnotation);
        this.getDatamanager().getStrategyHolder().addStrategy(this.strategyAnnotation,this.disposalStrategy);
        ProcessingData processingData = this.getDatamanager().getGarbageProcessor().processWaste(waste);
        this.getDatamanager().processData(processingData);
        this.getDatamanager().getStrategyHolder().removeStrategy(this.strategyAnnotation);


        return String.format("%.2f kg of %s successfully processed!",this.waste.getWeight(),this.waste.getName());
    }

    private GarbageDisposalStrategy strategyCreater(String params, Class neededAnnotation) {

        Class strategies=null;
        String currentArg[]=params.split("\\|");
        try {
            String className = currentArg[currentArg.length-1];
            Class exeClass = Class.forName("app.models.strategy." + className+"Strategy");
            if (exeClass.isAnnotationPresent(neededAnnotation)) {
                strategies = exeClass;
            }
        } catch (ReflectiveOperationException roe) {
            roe.printStackTrace();
        }



        if (strategies==null){
            throw new IllegalArgumentException("Strategy not found");
        }

        Class<GarbageDisposalStrategy> garbageStrategyClass = strategies;
        GarbageDisposalStrategy returnStrategy=null;
        try {
            Constructor<?> strategyConstructor = garbageStrategyClass.getConstructor();
            returnStrategy= (GarbageDisposalStrategy) strategyConstructor.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return returnStrategy;
    }


    private Waste wasteCreater(String params) {
        String currentArg[]=params.split("\\|");

        String className=currentArg[currentArg.length-1];
        Waste waste=null;
        try {
            Class<Waste> executableClass = (Class<Waste>) Class.forName("app.models.waste." + className + "Waste");
            Constructor<?> constructor = executableClass.getDeclaredConstructors()[0];
            Class<?>[] parameterTypes = constructor.getParameterTypes();

            Object[] wasteArguments =new Object[parameterTypes.length];

            for (int i = 0; i < parameterTypes.length; i++) {
                Class<?> parameterType = parameterTypes[i].isPrimitive()?this.getWrapper(parameterTypes[i]): parameterTypes[i];
                Constructor<?> parameterTypeConstructor = parameterType.getConstructor(String.class);
                wasteArguments[i] = parameterTypeConstructor.newInstance(currentArg[i]);
            }

            waste = (Waste) constructor.newInstance(wasteArguments);

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return waste;
    }

    private Class<?> getWrapper(Class<?> primitive){
      return   this.mapeer.get(primitive);
    }
}
