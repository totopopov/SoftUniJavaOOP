package coffeMachineProblem;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:43.
 */
public enum  Coin {
    ONE(1), TWO(2),FIVE(5), TEN(10), TWENTY(20), FIFTY(50);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
