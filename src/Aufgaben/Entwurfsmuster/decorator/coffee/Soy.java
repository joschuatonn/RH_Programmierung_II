package Aufgaben.Entwurfsmuster.decorator.coffee;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage){
        super(beverage);
        this.description = "mit Soja";
        this.price = 0.10;
    }
}
