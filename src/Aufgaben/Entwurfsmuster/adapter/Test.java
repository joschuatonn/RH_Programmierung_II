package Aufgaben.Entwurfsmuster.adapter;

import Aufgaben.Entwurfsmuster.adapter.DuckTurkey.MallardDuck;
import Aufgaben.Entwurfsmuster.adapter.DuckTurkey.Turkey;
import Aufgaben.Entwurfsmuster.adapter.DuckTurkey.WildTurkey;

public class Test {
    public static void main(String[] args) {
        Turkey turkey = new DuckAdapter(new MallardDuck());

        turkey.gobble();
        turkey.fly();
    }
}
