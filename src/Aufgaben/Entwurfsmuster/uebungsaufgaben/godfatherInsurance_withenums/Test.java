package Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums;

import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.BusinessType;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.Location;
import Aufgaben.Entwurfsmuster.uebungsaufgaben.godfatherInsurance_withenums.behaviours.Size;

public class Test {
    public static void main(String[] args) {
        FireInsurance fireInsurance = new FireInsurance(BusinessType.GASTRONOMY, Location.INDUSTRIAL_AREA, Size.LARGE, 1000);
        GlassInsurance glassInsurance = new GlassInsurance(BusinessType.GASTRONOMY, Location.INDUSTRIAL_AREA, Size.LARGE, 1000);

        System.out.println(fireInsurance.calculatePremium());
        System.out.println(glassInsurance.calculatePremium());
    }
}
