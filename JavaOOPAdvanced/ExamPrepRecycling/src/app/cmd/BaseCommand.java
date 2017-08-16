package app.cmd;

import app.conntacts.DataManagerAble;
import app.conntacts.Executable;



public abstract class BaseCommand implements Executable {
    private DataManagerAble datamanager;

    protected BaseCommand(DataManagerAble datamanager) {
        this.datamanager = datamanager;
    }

    protected DataManagerAble getDatamanager() {
        return this.datamanager;
    }
}
