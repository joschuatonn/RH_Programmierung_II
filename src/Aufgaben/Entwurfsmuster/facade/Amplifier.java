package Aufgaben.Entwurfsmuster.facade;

public class Amplifier {

    public void on() {
        System.out.println("Amplifier switching on!");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Setting input to DVD " + dvd.name);
    }

    public void setSurroundSound() {
        System.out.println("Amplifier activating surround sound");
    }

    public void setVolume(int i) {
        System.out.println("Amplifier setting volumn to " + i);
    }

    public void off() {
        System.out.println("Amplifier switching off!");
    }

}
