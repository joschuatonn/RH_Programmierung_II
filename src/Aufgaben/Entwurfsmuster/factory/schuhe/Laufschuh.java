package Aufgaben.Entwurfsmuster.factory.schuhe;

import Aufgaben.Entwurfsmuster.factory.Schuh;

public class Laufschuh implements Schuh {
    @Override
    public void laufen() {
        System.out.println("Laufen (sportlich) Laufen (sportlich)");
    }
}
