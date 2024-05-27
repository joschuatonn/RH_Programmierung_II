package Aufgaben.Entwurfsmuster.adapter;

import Aufgaben.Entwurfsmuster.adapter.DuckTurkey.Duck;
import Aufgaben.Entwurfsmuster.adapter.DuckTurkey.Turkey;

public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
