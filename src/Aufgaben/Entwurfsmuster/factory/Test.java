package Aufgaben.Entwurfsmuster.factory;

public class Test {
    public static void main(String[] args) {
        Schuh schuh = Schuhfabrik.erstelleSchuh(Schuharten.FLIPFLOP);
        schuh.laufen();
        schuh = Schuhfabrik.erstelleSchuh(Schuharten.LAUFSCHUH);
        schuh.laufen();
    }
}
