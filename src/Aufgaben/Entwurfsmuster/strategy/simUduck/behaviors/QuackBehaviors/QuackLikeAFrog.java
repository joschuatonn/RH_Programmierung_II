package Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.QuackBehaviors;

import Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.QuackBehaviors.QuackBehavior;

public class QuackLikeAFrog implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Ich quaaaacke wie ein Frosch (bin aber eine Ente)");
    }
}
