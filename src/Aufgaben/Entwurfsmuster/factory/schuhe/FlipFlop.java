package Aufgaben.Entwurfsmuster.factory.schuhe;

import Aufgaben.Entwurfsmuster.factory.Schuh;

public class FlipFlop  implements Schuh {

    @Override
    public void laufen() {
        System.out.println("Flip flop flip flop");
    }
}
