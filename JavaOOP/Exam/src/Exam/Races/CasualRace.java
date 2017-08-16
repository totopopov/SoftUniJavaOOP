package Exam.Races;

import Exam.Cars.Car;


public class CasualRace extends Race {
    public CasualRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }


    @Override
    public int calculateStats(Car car){
        return (car.getHorsepower()/car.getAcceleration())+(car.getSuspension()+car.getDurability());
    }




}
