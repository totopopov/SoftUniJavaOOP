package MooD3;

/**
 * Created by Todor Popov using Lenovo on 21.3.2017 г. at 0:36.
 */
public class Archangel extends BaseCharachter implements ArchangelAble {
    private int mana;

    public Archangel(String userName, int level,int mana) {
        super(userName, level);
        this.mana=mana;
    }

    @Override
    public String getHashPassword() {
        StringBuilder sb = new StringBuilder(super.getHashPassword());
        sb.reverse().append(super.getHashPassword().length()*21);
        return sb.toString().trim();
    }

    @Override
    public int getMana() {
        return this.mana;
    }

    @Override
    public String toString() {
        StringBuilder sb =new StringBuilder();

        sb.append(String.format("\"%s\"",super.getUserName())).append(" | ").append(String.format("\"%s\"",this.getHashPassword()));
        sb.append(" -> ").append("Archangel").append(System.lineSeparator()).append(super.getLevel()*this.getMana());

        return sb.toString().trim();
    }
}
