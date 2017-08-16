package MooD3;

/**
 * Created by Todor Popov using Lenovo on 21.3.2017 г. at 0:32.
 */
public abstract  class BaseCharachter implements BaseCharAble{
    private String userName;
    private int level;

    public BaseCharachter(String userName, int level) {
        this.userName = userName;
        this.level = level;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public String getHashPassword() {
        return this.getUserName();
    }

    @Override
    public int getLevel() {
        return this.level;
    }
}
