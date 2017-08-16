package interpreters;

import annotations.InjectArgs;
import annotations.InjectType;
import commands.Executable;
import core.ManagementSystem;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:18.
 */
public class CommandInterpreter implements Interpreter {

    private static final String COMMANDS_PATH = "commands.";
    private static final String COMMAND = "Command";

    private ManagementSystem managementSystem;

    public CommandInterpreter(ManagementSystem managementSystem) {
        this.managementSystem = managementSystem;
    }

    @Override
    public Executable interpretCommand(String line) {
       String[] params=line.split("\\|");
        String commandName=params[0];
        Executable executableReturn=null;
        try {
            Class<Executable> executableClass= (Class<Executable>) Class.forName(COMMANDS_PATH +commandName+ COMMAND);
            Constructor<Executable> declaredConstructor = executableClass.getDeclaredConstructor(ManagementSystem.class);
            Executable executable = declaredConstructor.newInstance(this.managementSystem);
            this.injectParams(executable,params);
            executableReturn=executable;
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }


        return executableReturn;
    }

    private void injectParams(Executable executable, String[] params) throws IllegalAccessException {
        Field[] fields=executable.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectArgs.class)){
                field.setAccessible(true);
                field.set(executable,params);
            break;
            } else if (field.isAnnotationPresent(InjectType.class)){
                field.setAccessible(true);
                field.set(executable,params[1]);
                break;
            }
        }
    }
}
