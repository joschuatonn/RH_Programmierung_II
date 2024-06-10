package Aufgaben.Entwurfsmuster.decorator.schreinerei.processings;

import Aufgaben.Entwurfsmuster.decorator.schreinerei.ProcessingDecorator;
import Aufgaben.Entwurfsmuster.decorator.schreinerei.Product;

public class GreenColor extends ProcessingDecorator {
    public GreenColor(Product product) {
        super(product);
        this.description = "grün lackiert";
        this.price = 21;
    }
}
