package Aufgaben.Entwurfsmuster.facade;

public class DvdPlayer {
    String name;

    public DvdPlayer() {
    }

    public void on() {
        System.out.println("Switching on DVD player");
    }

    public void play(String movie) {
        this.name = movie;
        System.out.println("----------------");
        System.out.println("Playing movie " + movie);
        System.out.println("...");
        System.out.println("----------------");
    }

    public void stop() {
        System.out.println("Stopping DVD");
    }

    public void eject() {
        System.out.println("Ejecting DVD");
    }

    public void off() {
        System.out.println("Shutting off DVD player");
    }

}
