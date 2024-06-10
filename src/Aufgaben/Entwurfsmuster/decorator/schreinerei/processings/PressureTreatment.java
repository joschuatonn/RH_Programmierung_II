package Aufgaben.Entwurfsmuster.decorator.schreinerei.processings;

import Aufgaben.Entwurfsmuster.decorator.schreinerei.ProcessingDecorator;
import Aufgaben.Entwurfsmuster.decorator.schreinerei.Product;

public class PressureTreatment extends ProcessingDecorator {
    public PressureTreatment(Product product) {
        super(product);
        this.description = "unter Druck behandelt";
        this.price = 21;
    }
}
