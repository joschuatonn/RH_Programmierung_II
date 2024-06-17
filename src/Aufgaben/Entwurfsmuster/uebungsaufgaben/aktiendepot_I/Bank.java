package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I;

import java.util.ArrayList;
import java.util.List;

public class Bank implements Subject{
    private List<Observer> observerList;

    private double gamestopKurs;
    private double dailyChange;

    public Bank() {
        System.out.println("Willkommen bei der Bank der GameStop-Investoren");
        this.observerList = new ArrayList<>();
    }

    public double getGamestopKurs() {
        return gamestopKurs;
    }

    public void setGamestopKurs(double gamestopKurs) {
        this.dailyChange = gamestopKurs - this.gamestopKurs;
        this.gamestopKurs = gamestopKurs;
        notifyObservers();
    }

    public double getDailyChange() {
        return dailyChange;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
