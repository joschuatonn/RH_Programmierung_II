package Aufgaben.Entwurfsmuster.decorator.coffee;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage){
        super(beverage);
        this.description = "mit Schaum";
        this.price = 0.15;
    }
}
