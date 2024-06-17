package Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd.businessTypes.BusinessType;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd.locations.Location;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd.sizes.Size;

public class FireInsurance extends Insurance {
    public FireInsurance(BusinessType businessType, Location location, Size size, double valueOfGoods) {
        super(133.43, businessType, location, size, valueOfGoods);
    }
}
