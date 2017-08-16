package FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 23.2.2017 г. at 17:00.
 */
public class Team {

    private String name;
    private  List<Person> firstTeam;
    private  List<Person> reserveTeam;

    public Team(String name) {
        this.name=name;
        this.firstTeam=new ArrayList<>();
        this.reserveTeam=new ArrayList<>();
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }

    public void addPlayer(Person person){
        if (person.getAge()<40){
            this.firstTeam.add(person);
        }else {
            this.reserveTeam.add(person);
        }
    }


}
