package Aufgaben.Entwurfsmuster.decorator.schreinerei;

import Aufgaben.Entwurfsmuster.decorator.coffee.Beverage;

public abstract class ProcessingDecorator extends Product {
    Product prodcut;

    public ProcessingDecorator(Product product) {
        this.prodcut = product;
    }

    public String getDescription() {
        return prodcut.getDescription()+ ", " + this.description;
    }

    public double cost(){
        return prodcut.cost() + this.price;
    }
}
