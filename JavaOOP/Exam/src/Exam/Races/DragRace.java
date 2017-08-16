package Exam.Races;


import Exam.Cars.Car;

import java.util.HashMap;
import java.util.List;

public class DragRace extends Race {
    public DragRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }


    @Override
    public int calculateStats(Car car) {
        return car.getHorsepower()/car.getAcceleration();
    }
}
