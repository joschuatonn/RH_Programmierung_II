package Aufgaben.Entwurfsmuster.adapter.koordinaten;

public class Test {
    public static void main(String[] args) {
        /*KarthesischeKoordinatenImpl k = new KarthesischeKoordinatenImpl(5, 5);

        PolarKoordinaten p = new KarthesischerAdapter(k);

        System.out.println(p.getRadius());
        System.out.println(p.getWinkel());*/

        PolareKoordinatenImpl p = new PolareKoordinatenImpl(5.0, 60.0);

        KarthesischeKoordinaten ka = new PolarerAdapter(p);

        System.out.println(ka.getX());
        System.out.println(ka.getY());
        ka.print();

        PolarKoordinaten p2 = new KarthesischerAdapter(new KarthesischeKoordinatenImpl(ka.getX(), ka.getY()));

        //System.out.println("Radius: " + p2.getRadius() + " | Winkel: " + p2.getWinkel());
        p2.print();
    }
}
