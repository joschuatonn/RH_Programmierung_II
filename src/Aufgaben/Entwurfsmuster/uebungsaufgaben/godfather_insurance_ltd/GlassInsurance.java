package Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd.businessTypes.BusinessType;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd.locations.Location;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd.sizes.Size;

public class GlassInsurance extends Insurance{
    public GlassInsurance(BusinessType businessType, Location location, Size size, double valueOfGoods) {
        super(129.11, businessType, location, size, valueOfGoods);
    }
}
