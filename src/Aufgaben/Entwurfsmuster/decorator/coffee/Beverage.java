package Aufgaben.Entwurfsmuster.decorator.coffee;

public abstract class Beverage {
    String description;
    double price;

    public abstract String getDescription();

    public abstract double cost();
}
