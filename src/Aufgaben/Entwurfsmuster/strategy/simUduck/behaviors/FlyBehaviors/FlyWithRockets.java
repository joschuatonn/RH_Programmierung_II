package Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.FlyBehaviors;

public class FlyWithRockets implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Ich fliege mit Rakten yippie");
    }
}
