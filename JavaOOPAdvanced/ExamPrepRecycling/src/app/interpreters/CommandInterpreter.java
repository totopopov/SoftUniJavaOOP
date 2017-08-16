package app.interpreters;


import app.annotations.InjectParams;
import app.conntacts.DataManagerAble;
import app.conntacts.Executable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:18.
 */
public class CommandInterpreter implements Interpreter {

    private static final String COMMANDS_PATH = "app.cmd.";
    private static final String COMMAND = "Command";
    private DataManagerAble dataManagerAble;


    public CommandInterpreter(DataManagerAble dataManagerAble) {
        this.dataManagerAble = dataManagerAble;
    }

    @Override
    public Executable interpretCommand(String line) {
        String[] params = line.split("\\s+");

        String commandName = params[0];
        Executable executableReturn = null;
        try {
            Class<Executable> executableClass = (Class<Executable>) Class.forName(COMMANDS_PATH + commandName + COMMAND);
            Constructor<Executable> declaredConstructor = executableClass.getDeclaredConstructor(DataManagerAble.class);
            declaredConstructor.setAccessible(true);
            Executable executable = declaredConstructor.newInstance(this.dataManagerAble);
            Field[] fields = executable.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(InjectParams.class)) {
                    field.setAccessible(true);
                    String injection=params[1];
                    field.set(executable, injection);
                    break;
                }
            }
            executableReturn = executable;
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return executableReturn;
    }

}
