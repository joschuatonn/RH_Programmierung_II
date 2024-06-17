package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_II.kunden;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.Bank;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_II.LehmanBrothers;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_II.Observer;

public class Hans extends Observer {
    private LehmanBrothers bank;

    public Hans(LehmanBrothers bank) {
        super();
        this.bank = bank;
        bank.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Hans: Aktie hat sich geändert");
    }
}
