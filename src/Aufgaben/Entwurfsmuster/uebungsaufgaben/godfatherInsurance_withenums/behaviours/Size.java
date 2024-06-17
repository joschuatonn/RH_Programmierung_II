package Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours;

public enum Size implements InsuranceBehaviour{
    SMALL("Small", 100),
    MEDIUM("Medium", 200),
    LARGE("Large", 300);

    private String name;
    private double price;

    Size(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
