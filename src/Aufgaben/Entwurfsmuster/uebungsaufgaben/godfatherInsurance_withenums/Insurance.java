package Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.BusinessType;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.Location;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.Size;

public abstract class Insurance {
    BusinessType businessType;
    Location location;
    Size size;

    double basePrice;
    double valueOfGoods;

    public Insurance(double basePrice, BusinessType businessType, Location location, Size size, double valueOfGoods) {
        this.basePrice = basePrice;
        this.businessType = businessType;
        this.location = location;
        this.size = size;
        this.valueOfGoods = valueOfGoods;
    }

    public double calculatePremium() {
        return valueOfGoods * 0.1 + basePrice + businessType.getPrice() + location.getPrice() + size.getPrice() + valueOfGoods;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getValueOfGoods() {
        return valueOfGoods;
    }

    public void setValueOfGoods(double valueOfGoods) {
        this.valueOfGoods = valueOfGoods;
    }
}
