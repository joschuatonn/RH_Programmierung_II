package Aufgaben.Entwurfsmuster.decorator.schreinerei;

public abstract class Product {
    protected String description;
    protected  double price;

    public abstract String getDescription();

    public abstract double cost();
}
