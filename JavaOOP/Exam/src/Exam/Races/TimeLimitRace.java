package Exam.Races;

import Exam.Cars.Car;

/**
 * Created by Todor Popov using Lenovo on 12.3.2017 г. at 21:24.
 */
public class TimeLimitRace extends Race {
    private int goldTime;
    public TimeLimitRace(int length, String route, int prizePool, int goldTime) {
        super(length, route, prizePool);
        this.goldTime=goldTime;
    }

    @Override
    public int calculateStats(Car car) {
        return this.getLength()*((car.getHorsepower()/100)*car.getAcceleration());
    }
}
