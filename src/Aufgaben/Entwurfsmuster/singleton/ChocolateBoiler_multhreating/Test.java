package Aufgaben.Entwurfsmuster.singleton.ChocolateBoiler_multhreating;

public class Test {
    public static void main(String[] args) {
        // Test the new multi threaded class
        ChocolateBoilerMulti c1 = ChocolateBoilerMulti.getInstance();
        c1.run();
        c1.run();
        c1.run();
        c1.run();

    }
}
