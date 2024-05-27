package Aufgaben.Entwurfsmuster.facade;

public class TheaterLights {

    public void dim(int i) {
        System.out.println("TheaterLights dimming to " + i);
    }

    public void on() {
        System.out.println("TheaterLights in full flash");
    }

}
