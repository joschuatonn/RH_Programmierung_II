package Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.QuackBehaviors;


public class QuackReallyLoud implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUAAAAACK");
    }
}
