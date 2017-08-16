package Exam.Races;

import Exam.Cars.Car;

import java.util.*;


public abstract class Race {
    private int length;
    private String route;
    private int prizePool;
    private List<Integer> participants;
    private boolean started;

    protected Race(int length, String route, int prizePool) {
        this.length = length;
        this.route = route;
        this.prizePool = prizePool;
        this.participants = new LinkedList<>();
        this.started=false;
    }


    public int getLength() {
        return length;
    }



    @Override
    public String toString() {
        return this.route+" - "+ this.length;
    }

    public boolean isStarted() {
        return this.started;
    }

    public void raceIsover() {
        this.started = false;
    }

    public void addParticipants(int id){
        this.participants.add(id);
    }

    public boolean isNotEmpty(){
        return !this.participants.isEmpty();
    }

    public List<Integer> getParticipants(){
        return Collections.unmodifiableList(this.participants);
    }

    public void clearparticipants(){
        this.participants.clear();
    }

    public boolean checkIfCarsIsRacing(int id){
        return this.participants.contains(id);
    }

    public int getProfit(int position){
        switch (position){
            case 1:return this.prizePool*50/100;
            case 2:return this.prizePool*30/100;
            case 3:return this.prizePool*20/100;
            default: return 0;
        }
    }


    public abstract int calculateStats(Car car);



}
