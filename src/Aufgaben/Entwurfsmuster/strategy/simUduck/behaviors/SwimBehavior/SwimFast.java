package Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.SwimBehavior;

public class SwimFast implements SwimBehavior{
    @Override
    public void swim() {
        System.out.println("Ich kann sehr schnell schwimmen");
    }
}
