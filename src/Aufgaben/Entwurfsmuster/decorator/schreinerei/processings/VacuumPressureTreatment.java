package Aufgaben.Entwurfsmuster.decorator.schreinerei.processings;

import Aufgaben.Entwurfsmuster.decorator.schreinerei.Product;

public class VacuumPressureTreatment extends PressureTreatment{
    public VacuumPressureTreatment(Product product) {
        super(product);
        this.description = "unter Vakuumdruck behandelt";
        this.price = 21;
    }
}
