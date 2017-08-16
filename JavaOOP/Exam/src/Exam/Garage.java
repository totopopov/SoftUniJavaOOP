package Exam;

import Exam.Cars.Car;


import java.util.*;

public class Garage {
    private HashMap<Integer,Car> parkedCars;

    public Garage() {
        this.parkedCars = new LinkedHashMap<>();
    }

    public void addCar(int id,Car car){
        this.parkedCars.putIfAbsent(id,car);
    }

    public boolean checkInGarage(int id){
        if (this.parkedCars.containsKey(id)){
            return false;
        }
        return true;
    }

    public void removeCar(int id){
        if (this.parkedCars.containsKey(id)){
            this.parkedCars.remove(id);
        }
    }


    public List<Integer> getParkedCars(){
        List<Integer> ids=new LinkedList<>();
        for (Integer integer : parkedCars.keySet()) {
            ids.add(integer);
        }
        return Collections.unmodifiableList(ids);
    }



    public void tuneCars(Car car,int tuneIndex,String tuneAddOn){
        switch (car.getClass().getSimpleName()){
            case "PerformanceCar":
                    car.increaseHorsePower(tuneIndex);
                    car.increaseSuspension(tuneIndex);
                    car.addAddOns(tuneAddOn);

                break;
            case "ShowCar":
                car.increaseHorsePower(tuneIndex);
                car.increaseSuspension(tuneIndex);
                car.increaseStars(tuneIndex);
                break;
        }


    }
}
