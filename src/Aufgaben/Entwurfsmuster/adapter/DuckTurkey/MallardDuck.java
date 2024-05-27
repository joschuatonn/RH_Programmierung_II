package Aufgaben.Entwurfsmuster.adapter.DuckTurkey;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Ich fliege.");
    }

}
