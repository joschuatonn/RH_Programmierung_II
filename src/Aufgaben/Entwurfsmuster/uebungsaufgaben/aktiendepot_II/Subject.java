package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_II;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
