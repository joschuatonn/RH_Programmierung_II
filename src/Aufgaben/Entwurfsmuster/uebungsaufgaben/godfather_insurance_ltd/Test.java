package Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd.businessTypes.Gastronomy;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd.locations.CityCenter;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfather_insurance_ltd.sizes.Large;

public class Test {
    public static void main(String[] args) {
        FireInsurance myFI = new FireInsurance(new Gastronomy(), new CityCenter(), new Large(), 3238.21);
        System.out.println(myFI.calculatePremium());

        GlassInsurance myGI = new GlassInsurance(new Gastronomy(), new CityCenter(), new Large(), 3238.21);
        System.out.println(myGI.calculatePremium());

    }
}
