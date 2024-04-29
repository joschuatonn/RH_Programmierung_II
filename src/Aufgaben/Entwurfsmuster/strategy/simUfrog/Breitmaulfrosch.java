package Aufgaben.Entwurfsmuster.strategy.simUfrog;

import Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.QuackBehaviors.QuackBehavior;
import Aufgaben.Entwurfsmuster.strategy.simUfrog.behaviors.jumpBehaviors.JumpBehavior;

public class Breitmaulfrosch extends Frog{
    public Breitmaulfrosch(JumpBehavior jumpBehavior, QuackBehavior quackBehavior) {
        super(jumpBehavior, quackBehavior);
    }
}
