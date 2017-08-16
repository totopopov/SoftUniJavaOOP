package hell;

import hell.core.DataHandler;
import hell.core.DataHandlerAble;
import hell.core.Engine;
import hell.core.interpreters.CommandInterpreter;
import hell.core.interpreters.Interpreter;
import hell.core.io.ConsoleReader;
import hell.core.io.ConsoleWriter;
import hell.interfaces.InputReader;
import hell.interfaces.OutputWriter;

public class Main {
    public static void main(String[] args) {
        OutputWriter outputWriter=new ConsoleWriter();
        InputReader inputReader=new ConsoleReader();
        DataHandlerAble dataHandler=new DataHandler();
        Interpreter interpreter= new CommandInterpreter(dataHandler);
        Runnable engine = new Engine(inputReader,outputWriter,interpreter);
        engine.run();

    }
}