package Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums;


import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.BusinessType;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.Location;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.Size;

public class GlassInsurance extends Insurance {
    public GlassInsurance(BusinessType businessType, Location location, Size size, double valueOfGoods) {
        super(129.11, businessType, location, size, valueOfGoods);
    }
}
