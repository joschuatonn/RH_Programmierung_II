package Aufgaben.Entwurfsmuster.singleton.ChocolateBoiler_getInstance;

public class Test {
    public static void main(String[] args) {
        ChocolateBoilerStart c1 = ChocolateBoilerStart.getInstance();
        System.out.println(c1);
        System.out.println(c1.hashCode());
        System.out.println(c1.isEmpty());
        c1.fill();
        System.out.println(c1.isEmpty());

        System.out.println("x--- JETZT KOMMT DER ZWEITE BOILER ---x");

        ChocolateBoilerStart c2 = ChocolateBoilerStart.getInstance();
        System.out.println(c2);
        System.out.println(c2.hashCode());
        System.out.println(c2.isEmpty());
    }
}
