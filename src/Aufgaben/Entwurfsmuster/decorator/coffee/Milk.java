package Aufgaben.Entwurfsmuster.decorator.coffee;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage){
        super(beverage);
        this.description = "mit Milch";
        this.price = 0.10;
    }
}
