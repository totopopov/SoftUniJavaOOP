package FootballTeamGenerator;

/**
 * Created by Todor Popov using Lenovo on 27.2.2017 г. at 19:26.
 */
abstract class Name {

    private String name;

    public Name(String name) {
        this.setName(name);
    }

    protected String getName() {
        return this.name;
    }

    private void setName(String name) {

        if (name==null || name.isEmpty() || name.trim().length()==0){
            throw new IllegalArgumentException("A name should not be empty.");
        }

        this.name = name;
    }
}
