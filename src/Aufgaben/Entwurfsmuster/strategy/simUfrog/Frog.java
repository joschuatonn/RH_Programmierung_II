package Aufgaben.Entwurfsmuster.strategy.simUfrog;

import Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.QuackBehaviors.QuackBehavior;
import Aufgaben.Entwurfsmuster.strategy.simUfrog.behaviors.jumpBehaviors.JumpBehavior;

public abstract class Frog {
    JumpBehavior jumpBehavior;
    QuackBehavior quackBehavior;

    public Frog(JumpBehavior jumpBehavior, QuackBehavior quackBehavior) {
        this.jumpBehavior = jumpBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performJump() {
        this.jumpBehavior.jump();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public JumpBehavior getJumpBehavior() {
        return jumpBehavior;
    }

    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
