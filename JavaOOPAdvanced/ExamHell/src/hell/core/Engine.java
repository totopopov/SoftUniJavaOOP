package hell.core;

import hell.core.Cmd.Executable;
import hell.interfaces.InputReader;
import hell.interfaces.OutputWriter;
import hell.core.interpreters.Interpreter;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 16:57.
 */
public class Engine implements Runnable {
    private InputReader reader;
    private OutputWriter writer;
    private Interpreter interpreter;

    public Engine(InputReader reader, OutputWriter writer, Interpreter interpreter) {
        this.reader = reader;
        this.writer = writer;
        this.interpreter=interpreter;
    }

    @Override
    public void run() {
        String input;
        while (true){
            input=reader.readLine();
            Executable executable = this.interpreter.interpretCommand(input);
            String executeResponce = executable.execute();
            this.writer.writeLine(executeResponce);
            if ("Quit".equals(input)){
                break;
            }
        }
    }
}
