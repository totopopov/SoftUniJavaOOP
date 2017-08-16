package MilitaryElite.models;

import MilitaryElite.Interfaces.LeutenantGeneral;
import MilitaryElite.Interfaces.Private;
import MilitaryElite.Interfaces.Soldier;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 16:00.
 */
public class LeutenantGeneralImpl extends PrivateImpl implements LeutenantGeneral {
    private Map<Integer,Private> privates;

    public LeutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates=new LinkedHashMap<>();
    }

    @Override
    public void addPrivate(Private privateSold) {
        this.privates.putIfAbsent(privateSold.getId(),privateSold);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append(System.lineSeparator());
        sb.append("Privates:").append(System.lineSeparator());

        privates.entrySet().forEach(p-> sb.append("  "+p.getValue().toString()).append(System.lineSeparator()));

        return sb.toString().trim();
    }
}
