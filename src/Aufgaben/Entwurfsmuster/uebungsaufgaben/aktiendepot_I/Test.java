package Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.kunden.AmateuerInvestor;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.kunden.Horst;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.aktiendepot_I.kunden.ProfiInvestorHerrKloss;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Horst horst = new Horst(bank);
        AmateuerInvestor amateuerInvestor = new AmateuerInvestor(bank);
        ProfiInvestorHerrKloss profiInvestorHerrKloss = new ProfiInvestorHerrKloss(bank);

        bank.setGamestopKurs(100);
        System.out.println("---");
        bank.setGamestopKurs(10);
        System.out.println("---");
        bank.setGamestopKurs(1000);

    }
}
