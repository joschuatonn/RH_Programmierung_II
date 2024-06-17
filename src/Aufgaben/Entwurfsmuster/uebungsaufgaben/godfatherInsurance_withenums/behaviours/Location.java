package Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours;

public enum Location implements InsuranceBehaviour {
    CITY_CENTER("City Center", 1000),
    INDUSTRIAL_AREA("Industrial Area", 326),
    SUBURB("Suburb", 200),
    OUTSKIRTS("Outskirts", 100);

    private String name;
    private double price;

    Location(String name, double price) {
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
