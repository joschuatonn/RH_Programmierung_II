package Aufgaben.Entwurfsmuster.factory;

import Aufgaben.Entwurfsmuster.factory.schuhe.FlipFlop;
import Aufgaben.Entwurfsmuster.factory.schuhe.Laufschuh;

public class Schuhfabrik {
    public static Schuh erstelleSchuh(Schuharten schuhart) {
        return switch (schuhart) {
            case FLIPFLOP -> new FlipFlop();
            case LAUFSCHUH -> new Laufschuh();
            default -> null;
        };
    }
}
