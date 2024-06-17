package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_II;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {
    private List<Aktie> depot;

    public Observer() {
        this.depot = new ArrayList<>();
    }

    public abstract void update();

    public List<Aktie> getDepot() {
        return depot;
    }

    public void removeFromDepot(Aktie aktie) {
        this.depot.remove(aktie);
    }

    public void addToDepot(Aktie aktie) {
        this.depot.add(aktie);
        System.out.println(this.getDepot());
    }
}
