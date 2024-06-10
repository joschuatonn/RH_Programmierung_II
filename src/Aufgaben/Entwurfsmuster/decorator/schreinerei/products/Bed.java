package Aufgaben.Entwurfsmuster.decorator.schreinerei.products;

import Aufgaben.Entwurfsmuster.decorator.schreinerei.Product;

public class Bed extends Product {
    @Override
    public String getDescription() {
        return "Ein Bett";
    }

    @Override
    public double cost() {
        return 983;
    }
}
