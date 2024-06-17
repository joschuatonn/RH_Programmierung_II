package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.kunden;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.Bank;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.Observer;

public class Horst implements Observer {
    private Bank bank;

    public Horst(Bank bank) {
        bank.registerObserver(this);
        this.bank = bank;
    }

    @Override
    public void update() {
        System.out.println("Horst: Das ist ja spannend, der GameStop-Kurs ist jetzt bei " + bank.getGamestopKurs() + "€!");
    }
}
