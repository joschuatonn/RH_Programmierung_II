package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_II;

import java.util.ArrayList;
import java.util.List;

public class Aktie implements StockSubject {
    private String displayName;
    private String shortName;
    private List<Double> pricesOfLastWeek;

    private List<StockObserver> observerList;

    public Aktie(String displayName, String shortName, List<Double> pricesOfLastWeek) {
        this.displayName = displayName;
        this.shortName = shortName;
        this.pricesOfLastWeek = pricesOfLastWeek;
        this.observerList = new ArrayList<>();
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getShortName() {
        return shortName;
    }

    public List<Double> getPricesOfLastWeek() {
        return pricesOfLastWeek;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
        this.notifyObservers();
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setPricesOfLastWeek(List<Double> pricesOfLastWeek) {
        this.pricesOfLastWeek = pricesOfLastWeek;
        this.notifyObservers();
    }

    public void addTodaysPrice(double todaysPrice) {
        if(this.pricesOfLastWeek.size() >= 7) {
            pricesOfLastWeek.remove(0);
            pricesOfLastWeek.add(todaysPrice);
        }
        this.notifyObservers();
    }

    @Override
    public void registerObserver(StockObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StockObserver observer : observerList) {
            observer.update(this);
        }
    }
}
