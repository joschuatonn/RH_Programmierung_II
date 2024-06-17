package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.kunden;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.Bank;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.Observer;

public class AmateuerInvestor implements Observer {
    private Bank bank;

    public AmateuerInvestor(Bank bank) {
        bank.registerObserver(this);
        this.bank = bank;
    }

    @Override
    public void update() {
        System.out.print("AmateuerInvestor: Der GameStop-Kurs ist jetzt bei " + bank.getGamestopKurs() + "€!");
        if(bank.getGamestopKurs() > 100) {
            System.out.println("Das ist mir leider zu teuer :(");
        } else {
            System.out.println("Da steige ich mal ein und werden reich!");
        }
    }
}
