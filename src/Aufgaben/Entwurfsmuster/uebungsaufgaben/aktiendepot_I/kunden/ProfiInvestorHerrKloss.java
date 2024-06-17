package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.kunden;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.Bank;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.Observer;

public class ProfiInvestorHerrKloss implements Observer {
    private Bank bank;

    public ProfiInvestorHerrKloss(Bank bank) {
        bank.registerObserver(this);
        this.bank = bank;
    }

    @Override
    public void update() {
        System.out.print("ProfiInvestorHerrKloss: Der GameStop-Kurs ist jetzt bei " + bank.getGamestopKurs() + "€!");
        if(bank.getDailyChange() > 0) {
            System.out.println("Das geht ja immer weiter hoch, das ist ja super");
        } else {
            System.out.println("Geht ja runter bah");
        }
    }
}
