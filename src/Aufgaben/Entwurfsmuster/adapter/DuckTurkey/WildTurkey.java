package Aufgaben.Entwurfsmuster.adapter.DuckTurkey;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("Ich fliege ein kurzes Stueck.");
    }
    
}
