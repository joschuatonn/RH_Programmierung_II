package Aufgaben.Entwurfsmuster.decorator.coffee;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+ ", " + this.description;
    }

    public double cost(){
        return beverage.cost() + this.price;
    }
}
