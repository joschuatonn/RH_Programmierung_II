package Aufgaben.Entwurfsmuster.decorator.schreinerei.products;

import Aufgaben.Entwurfsmuster.decorator.schreinerei.Product;

public class Chair extends Product {
    @Override
    public String getDescription() {
        return "Ein Stuhl";
    }

    @Override
    public double cost() {
        return 32;
    }
}
