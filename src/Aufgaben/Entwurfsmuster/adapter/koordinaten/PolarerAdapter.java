package Aufgaben.Entwurfsmuster.adapter.koordinaten;

public class PolarerAdapter implements KarthesischeKoordinaten{
    PolareKoordinatenImpl polareKoordinaten;

    public PolarerAdapter(PolareKoordinatenImpl polareKoordinaten) {
        this.polareKoordinaten = polareKoordinaten;
    }
    @Override
    public double getX() {
        return polareKoordinaten.getRadius() * Math.cos(Math.toRadians(polareKoordinaten.getWinkel()));
    }

    @Override
    public double getY() {
        return polareKoordinaten.getRadius() * Math.sin(Math.toRadians(polareKoordinaten.getWinkel()));
    }

    @Override
    public void setX(double x) {

    }

    @Override
    public void setY(double y) {

    }

    @Override
    public void print() {
        System.out.println("("+this.getX()+";"+this.getY()+")");
    }
}
