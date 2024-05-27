package Aufgaben.Entwurfsmuster.singleton.ChocolateBoiler_multhreating;

import Aufgaben.Entwurfsmuster.singleton.ChocolateBoiler_getInstance.ChocolateBoilerStart;

public class ChocolateBoilerMulti implements Runnable {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerMulti instance;

    private ChocolateBoilerMulti() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoilerMulti getInstance() {
        if (instance == null) {
            instance = new ChocolateBoilerMulti();
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    @Override
    public void run() {
        System.out.println("## " + this.hashCode());
        System.out.println("Executing fill");
        fill();

        System.out.println("Executing boil");
        boil();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Executing drain");
        drain();

    }
}
