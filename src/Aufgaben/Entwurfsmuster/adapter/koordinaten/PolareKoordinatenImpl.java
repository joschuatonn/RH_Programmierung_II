package Aufgaben.Entwurfsmuster.adapter.koordinaten;

public class PolareKoordinatenImpl implements PolarKoordinaten{
    private double radius;
    private double winkel;

    public PolareKoordinatenImpl(double radius, double winkel) {
        this.setRadius(radius);
        this.setWinkel(winkel);
    }

    @Override
    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getWinkel() {
        return this.winkel;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setWinkel(double winkel) {
        this.winkel = winkel;
    }

    @Override
    public void print() {
        System.out.println("Radius: " + this.getRadius() + " | Winkel: " + this.getWinkel()+"°");
    }
}
