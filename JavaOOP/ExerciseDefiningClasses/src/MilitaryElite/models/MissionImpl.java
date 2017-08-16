package MilitaryElite.models;

import MilitaryElite.Interfaces.Mission;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 16:33.
 */
public class MissionImpl implements Mission {
    private String code;
    private String state;

    public MissionImpl(String code, String state) {
        this.code = code;
        this.setState(state);
    }

    public void setState(String state) {
       if (state.equals("inProgress") || state.equals("Finished")){
           this.state = state;
       }else{
           this.state=null;
       }

    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {

        if (this.state==null){
            return "";
        }

        return String.format("  Code Name: %s State: %s",this.getCode(),this.getState());
    }
}
