package Aufgaben.Entwurfsmuster.decorator.coffee;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage){
        super(beverage);
        this.description = "mit Mocha";
        this.price = 0.20;
    }
}
