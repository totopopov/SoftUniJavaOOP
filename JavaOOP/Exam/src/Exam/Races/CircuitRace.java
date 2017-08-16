package Exam.Races;

import Exam.Cars.Car;

/**
 * Created by Todor Popov using Lenovo on 12.3.2017 г. at 21:50.
 */
public class CircuitRace extends Race{
    private int laps;
    public CircuitRace(int length, String route, int prizePool,int laps) {
        super(length, route, prizePool);
        this.laps=laps;
    }

    @Override
    public int calculateStats(Car car) {
        return 0;
    }
}
