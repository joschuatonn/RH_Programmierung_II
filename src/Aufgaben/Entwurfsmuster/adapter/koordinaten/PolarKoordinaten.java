package Aufgaben.Entwurfsmuster.adapter.koordinaten;

public interface PolarKoordinaten {
    public double getRadius();
    public double getWinkel();
    public void setRadius(double radius);
    public void setWinkel(double winkel);

    public void print();
}
