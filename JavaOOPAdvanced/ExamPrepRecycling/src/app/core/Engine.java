package app.core;

import app.conntacts.DataManagerAble;
import app.conntacts.Executable;
import app.interpreters.Interpreter;
import app.io.Reader;
import app.io.Writer;
import app.waste_disposal.contracts.GarbageProcessor;
import app.waste_disposal.contracts.StrategyHolder;


public class Engine implements Runnable {
    private Reader reader;
    private Writer writer;
    private Interpreter interpreter;

    public Engine(Reader reader, Writer writer, Interpreter interpreter) {
        this.reader = reader;
        this.writer = writer;
        this.interpreter=interpreter;

    }

    @Override
    public void run() {

        String input;

        while (true){
            input=reader.readln();
            if ("TimeToRecycle".equals(input)){
                break;
            }
            Executable executable = this.interpreter.interpretCommand(input);
            String executeResponce = executable.execute();
            this.writer.writeLn(executeResponce);
        }
    }
}
