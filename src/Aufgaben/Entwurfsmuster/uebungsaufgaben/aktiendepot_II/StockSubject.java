package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_II;

public interface StockSubject {
    void registerObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers();
}
