package dungensAndDragons.loggers;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 15:38.
 */
public abstract class Logger implements Handler {
    private Handler successor;

    public abstract void handle(LogType type, String message);

    @Override
    public void setSuccessor(Handler successor) {
        this.successor=successor;
    }

    protected void passToSuccessor(LogType type, String message){
        if (this.successor!=null){
            successor.handle(type,message);
        }
    }
}
