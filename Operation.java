package com.mycompany.asmtechconstructionprivatelimitedsimple;

public class Operation {

    public static double totalCost(double area, int type) {
        if (type == 1) {
            return area * Rate.ratePlot;
        } else if (type == 2) {
            return area * Rate.rateOffice;
        } else if (type == 3) {
            return area * Rate.rateFlat;
        }
        return -1;
    }

    public static double greenPlantCharges(double totalCost) {
        return (totalCost * Rate.greenTax);
    }

    public static double registryCharges(double totalCost) {
        return (totalCost * Rate.registryTax);
    }

}
