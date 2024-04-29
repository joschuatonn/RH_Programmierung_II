package Aufgaben.Entwurfsmuster.strategy.simUfrog.behaviors.jumpBehaviors;

public class JumpReallyHigh implements JumpBehavior{
    @Override
    public void jump() {
        System.out.println("Ich kann sehr hoch springen");
    }
}
