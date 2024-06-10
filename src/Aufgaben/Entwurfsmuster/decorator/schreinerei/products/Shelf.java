package Aufgaben.Entwurfsmuster.decorator.schreinerei.products;

import Aufgaben.Entwurfsmuster.decorator.schreinerei.Product;

public class Shelf extends Product {
    @Override
    public String getDescription() {
        return "Ein Regal";
    }

    @Override
    public double cost() {
        return 29;
    }
}
