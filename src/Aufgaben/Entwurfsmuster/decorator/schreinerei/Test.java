package Aufgaben.Entwurfsmuster.decorator.schreinerei;

import Aufgaben.Entwurfsmuster.decorator.schreinerei.processings.PressureTreatment;
import Aufgaben.Entwurfsmuster.decorator.schreinerei.processings.RedColor;
import Aufgaben.Entwurfsmuster.decorator.schreinerei.products.Table;

public class Test {
    public static void main(String[] args) {
        Product table = new Table();
        System.out.println(table.cost());
        System.out.println(table.getDescription());

        ProcessingDecorator withRedPaint = new RedColor(table);
        System.out.println(withRedPaint.cost());
        System.out.println(withRedPaint.getDescription());

        ProcessingDecorator withPressureTreatment = new PressureTreatment(withRedPaint);
        System.out.println(withPressureTreatment.cost());
        System.out.println(withPressureTreatment.getDescription());

    }
}
