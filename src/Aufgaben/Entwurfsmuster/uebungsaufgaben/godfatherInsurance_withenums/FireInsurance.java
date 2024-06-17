package Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.BusinessType;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.Location;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.Size;

public class FireInsurance extends Insurance {
    public FireInsurance(BusinessType businessType, Location location, Size size, double valueOfGoods) {
        super(133.43, businessType, location, size, valueOfGoods);
    }
}
