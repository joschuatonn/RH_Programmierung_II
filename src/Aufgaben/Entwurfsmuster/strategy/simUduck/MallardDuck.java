package Aufgaben.Entwurfsmuster.strategy.simUduck;


import Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.FlyBehaviors.FlyBehavior;
import Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.QuackBehaviors.QuackBehavior;
import Aufgaben.Entwurfsmuster.strategy.simUduck.behaviors.SwimBehavior.SwimBehavior;

public class MallardDuck extends Duck{
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, SwimBehavior swimBehavior) {
        super(flyBehavior, quackBehavior, swimBehavior);
    }

    public void doThingsThatOnlyAMallardDuckCanDo() {
        System.out.println("Nur ICH kann das machen HAHAHAHHAH");
    }
}
