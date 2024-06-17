package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_II;

import java.util.ArrayList;
import java.util.List;

public class LehmanBrothers implements Subject, StockObserver{
    private final List<Observer> observerList;

    public LehmanBrothers() {
        System.out.println("Willkommen bei unserer Bank");
        this.observerList = new ArrayList<>();
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

    @Override
    public void update(Aktie aktie) {
        System.out.println("Aktie " + aktie.getDisplayName() + " hat sich geändert");
        System.out.println("Diese Information wird mit deren Investoren geteilt");
        for(Observer observer : observerList) {
            if(observer.getDepot().contains(aktie)) {
                observer.update();
            }
        }
    }
}
