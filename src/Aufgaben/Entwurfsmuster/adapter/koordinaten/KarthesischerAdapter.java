package Aufgaben.Entwurfsmuster.adapter.koordinaten;

public class KarthesischerAdapter implements PolarKoordinaten{
    KarthesischeKoordinatenImpl karthesischeKoordinaten;

    public KarthesischerAdapter(KarthesischeKoordinatenImpl karthesischeKoordinaten) {
        this.karthesischeKoordinaten = karthesischeKoordinaten;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow(this.karthesischeKoordinaten.getX(), 2) + Math.pow(this.karthesischeKoordinaten.getY(), 2));
    }

    @Override
    public double getWinkel() {
        return Math.toDegrees(Math.acos(this.karthesischeKoordinaten.getX() / this.getRadius()));
    }

    @Override
    public void setRadius(double radius) {

    }

    @Override
    public void setWinkel(double winkel) {

    }

    @Override
    public void print() {
        System.out.println("Radius: " + this.getRadius() + " | Winkel: " + this.getWinkel()+"°");
    }
}
