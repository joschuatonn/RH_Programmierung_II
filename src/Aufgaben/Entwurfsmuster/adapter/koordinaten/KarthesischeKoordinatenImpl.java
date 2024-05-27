package Aufgaben.Entwurfsmuster.adapter.koordinaten;

public class KarthesischeKoordinatenImpl implements KarthesischeKoordinaten{
    private double x;
    private double y;

    public KarthesischeKoordinatenImpl(double x, double y) {
        this.setX(x);
        this.setY(y);
    }
    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void print() {
        System.out.println("("+this.getX()+";"+this.getY()+")");
    }
}
