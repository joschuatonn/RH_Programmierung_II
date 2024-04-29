package Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.QuackBehaviors;


public class QuackInFrench implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Coa Coa");
    }
}
