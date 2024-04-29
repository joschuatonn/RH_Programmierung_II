package Aufgaben.Entwurfsmuster.strategy.simUfrog.behaviors.jumpBehaviors;

public class CannotJump implements JumpBehavior{
    @Override
    public void jump() {
        System.out.println("Ich kann nicht springen :(");
    }
}
