package Aufgaben.Entwurfsmuster.decorator.schreinerei.products;

import Aufgaben.Entwurfsmuster.decorator.schreinerei.Product;

public class Table extends Product {
    @Override
    public String getDescription() {
        return "Ein Tisch";
    }

    @Override
    public double cost() {
        return 2300;
    }
}
