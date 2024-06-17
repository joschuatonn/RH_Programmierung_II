package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_II;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_II.kunden.Hans;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        LehmanBrothers lehmanBrothers = new LehmanBrothers();
        Aktie wirecard = new Aktie("Wirecard", "WDI", new ArrayList<>());
        Aktie tesla = new Aktie("Tesla", "TSLA", new ArrayList<>());

        wirecard.registerObserver(lehmanBrothers);
        tesla.registerObserver(lehmanBrothers);

        wirecard.addTodaysPrice(1.1);

        // KUnden
        Hans hans = new Hans(lehmanBrothers);


        wirecard.addTodaysPrice(1.2);

        hans.addToDepot(wirecard);
        hans.addToDepot(tesla);
    }
}
