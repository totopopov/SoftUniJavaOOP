package engines;

import commands.Executable;
import interpreters.Interpreter;
import io.Reader;
import io.Writer;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:01.
 */
public class Engine implements Runnable {
    private Reader reader;
    private Writer writer;
    private Interpreter interpreter;

    public Engine(Reader reader, Writer writer, Interpreter interpreter) {
        this.reader = reader;
        this.writer = writer;
        this.interpreter = interpreter;
    }

    @Override
    public void run() {

        String input;

        while (true){
            input=reader.readln();
            if ("EmergencyBreak".equals(input)){
                break;
            }
            Executable executable = this.interpreter.interpretCommand(input);
            String executeResponce = executable.execute();
            this.writer.writeLn(executeResponce);
        }
    }
}
