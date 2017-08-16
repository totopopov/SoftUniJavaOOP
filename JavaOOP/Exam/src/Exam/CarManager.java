package Exam;

import Exam.Cars.Car;
import Exam.Cars.PerformanceCar;
import Exam.Cars.ShowCar;
import Exam.Races.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;


public class CarManager {
    private HashMap<Integer,Car> cars;
    private HashMap<Integer,Race> races;
    private Garage garage;

    public CarManager() {
        this.cars = new LinkedHashMap<>();
        this.races=new LinkedHashMap<>();
        this.garage=new Garage();
    }

    public void register(int id, String type, String brand, String model,
                         int year, int horsepower, int acceleration, int suspension, int durability){
        switch (type){
            case "Performance":
                PerformanceCar performanceCar=new PerformanceCar(brand,model,year,horsepower,acceleration,suspension,durability);
                this.cars.putIfAbsent(id,performanceCar);
                break;
            case "Show":
                ShowCar showCar=new ShowCar(brand,model,year,horsepower,acceleration,suspension,durability);
                this.cars.putIfAbsent(id,showCar);
                break;
        }

    }

    public String check(int id){
        if (this.cars.containsKey(id)){
            return this.cars.get(id).toString();
        }
        return "";
    }

    public void participate(int carId, int raceId){
        if (this.garage.checkInGarage(carId)){
            if (this.races.containsKey(raceId)){
                if (races.get(raceId).getClass().getSimpleName().equals("TimeLimitRace")){
                    if (races.get(raceId).getParticipants().size()==0){
                        this.races.get(raceId).addParticipants(carId);
                    }

                }else {

                    this.races.get(raceId).addParticipants(carId);
                }
            }
        }
    }


    public void open(int id, String type, int length, String route, int prizePool){
         Race race=raceGenerator(type,length,route,prizePool);
         this.races.putIfAbsent(id,race);
    }

    public void openBonus(int id, String type, int length, String route, int prizePool, int bonusParam){
        Race race=raceBonusGenerator(type,length,route,prizePool,bonusParam);
        this.races.putIfAbsent(id,race);
    }

    private Race raceBonusGenerator(String type, int length, String route, int prizePool, int bonusParam) {
        switch (type){
            case "Circuit": return new CircuitRace(length,route,prizePool,bonusParam);
            case "TimeLimit": return new TimeLimitRace(length,route,prizePool,bonusParam);
            default:
                return null;
        }
    }


    public void park(int carId){
        if (this.races.values().stream().map(r->r.checkIfCarsIsRacing(carId)).filter(c-> c).count()==0){
            this.garage.addCar(carId,this.cars.get(carId));
        }
    }

    public void unpark(int carId){
        this.garage.removeCar(carId);
    }

    public String start(int raceId) {
        if (this.races.containsKey(raceId))
            if (this.races.get(raceId).isNotEmpty() && !this.races.get(raceId).isStarted()) {

                HashMap<Integer,Integer> results=new LinkedHashMap<>();

                for (Integer car : races.get(raceId).getParticipants()) {
                    results.putIfAbsent(car,races.get(raceId).calculateStats(this.cars.get(car)));
                }


                StringBuilder sb=new StringBuilder();
                sb.append(String.format("%s",this.races.get(raceId).toString())).append(System.lineSeparator());

                final int[] position = {1};

                ConcurrentMap<Integer, Integer> winners = results.entrySet().stream()
                        .sorted((car1, car2) -> car2.getValue().compareTo(car1.getValue()))
                        .limit(4).collect(Collectors.toConcurrentMap(Map.Entry::getKey, Map.Entry::getValue));





                String output=sb.toString();
                output=output.substring(0,output.lastIndexOf(System.lineSeparator()));

                this.races.get(raceId).raceIsover();
                this.races.get(raceId).clearparticipants();

                return output;
            } else {
                return "Cannot start the race with zero participants.";
            }
        return "";
    }

    public void tune(int tuneIndex,String AddOn){
        for (Integer parkedCar : this.garage.getParkedCars()) {
            this.garage.tuneCars(this.cars.get(parkedCar),tuneIndex,AddOn);
        }
    }


    private Race raceGenerator(String type,int length, String route, int prizePool){
        switch (type){
            case "Drag": return new DragRace(length,route,prizePool);
            case "Casual": return new CasualRace(length,route,prizePool);
            case "Drift": return new DriftRace(length,route,prizePool);
            default:
                return null;
        }
    }


}
