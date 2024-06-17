package Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours;

public enum BusinessType implements InsuranceBehaviour {
    GASTRONOMY("Gastronomy", 832),
    TRADE("Trade", 102),
    PRODUCTION("Production", 221),
    SERVICES("Services", 434);

    private String name;
    private double price;

    BusinessType(String name, double price) {
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
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
