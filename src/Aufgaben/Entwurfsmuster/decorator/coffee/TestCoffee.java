package Aufgaben.Entwurfsmuster.decorator.coffee;

public class TestCoffee {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.cost());
        System.out.println(darkRoast.getDescription());

        CondimentDecorator withMilk = new Milk(darkRoast);
        System.out.println(withMilk.cost());
        System.out.println(withMilk.getDescription());

        CondimentDecorator withMocha = new Mocha(withMilk);
        System.out.println(withMocha.cost());
        System.out.println(withMocha.getDescription());

        CondimentDecorator with2ndMocha = new Mocha(withMocha);
        System.out.println(with2ndMocha.cost());
        System.out.println(with2ndMocha.getDescription());
    }
}
