package Aufgaben.Entwurfsmuster.strategy.simUfrog;

import Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.QuackBehaviors.QuackBehavior;
import Aufgaben.Entwurfsmuster.strategy.simUfrog.behaviors.jumpBehaviors.JumpBehavior;

public class Laubfrosch extends Frog{
    public Laubfrosch(JumpBehavior jumpBehavior, QuackBehavior quackBehavior) {
        super(jumpBehavior, quackBehavior);
    }
}
