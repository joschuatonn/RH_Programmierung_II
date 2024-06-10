package Aufgaben.Entwurfsmuster.decorator.schreinerei.processings;

import Aufgaben.Entwurfsmuster.decorator.schreinerei.ProcessingDecorator;
import Aufgaben.Entwurfsmuster.decorator.schreinerei.Product;

public class RedColor extends ProcessingDecorator {
    public RedColor(Product product) {
        super(product);
        this.description = "rot lackiert";
        this.price = 21;
    }
}
