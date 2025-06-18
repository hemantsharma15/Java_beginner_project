package com.mycompany.asmtechconstructionprivatelimitedsimple;

public class Estimation {

    public static void printEstimatePlot(Plot p) {
        System.out.println("The bill is genereted by Plot");
        System.out.println("-------------------------------------");

        System.out.println("Length : " + p.getLength());
        System.out.println("Width : " + p.getWidth());

        double area = p.getAreaPlot();
        System.out.println("Area of plot : " + area);

        System.out.println("-------------------------------------");

        double totalcost = Operation.totalCost(area, 1);
        System.out.println("Total Cost of plot : " + totalcost);

        double greenTax = Operation.greenPlantCharges(totalcost);
        System.out.println("Green tax: " + greenTax);

        double registryCharges = Operation.registryCharges(totalcost);
        System.out.println("Registry charges : " + registryCharges);

        double societyDevelopment = Rate.societyDevelopment;
        System.out.println("Society Development :" + societyDevelopment);

        System.out.println("-----------------------------------------");

        double GrandTotal = totalcost + greenTax + registryCharges + societyDevelopment;
        System.out.println("Grand total :" + GrandTotal);
    }

    public static void printEstimateOffice(Office p) {
        System.out.println("The bill is genereted by Office");
        System.out.println("----------------------------------------");

        System.out.println("Length : " + p.getLength());
        System.out.println("Width : " + p.getWidth());

        double area = p.getAreaOffice();
        System.out.println("Area of plot : " + area);

        System.out.println("----------------------------------------");

        double totalcost = Operation.totalCost(area, 2);
        System.out.println("Total Cost of plot : " + totalcost);

        double greenTax = Operation.greenPlantCharges(totalcost);
        System.out.println("Green tax: " + greenTax);

        double registryCharges = Operation.registryCharges(totalcost);
        System.out.println("Registry charges : " + registryCharges);

        double societyDevelopment = Rate.societyDevelopment;
        System.out.println("Society Development :" + societyDevelopment);

        System.out.println("-----------------------------------------");

        double GrandTotal = totalcost + greenTax + registryCharges + societyDevelopment;
        System.out.println("Grand total :" + GrandTotal);
    }

    public static void printEstimateFlat(Flat p) {
        System.out.println("The bill is genereted by Flat");
        System.out.println("-----------------------------------------");

        double area = p.getArea();
        System.out.println("Area of plot : " + area);

        System.out.println("------------------------------------------");

        double totalcost = Operation.totalCost(area, 3);
        System.out.println("Total Cost of plot : " + totalcost);

        double greenTax = Operation.greenPlantCharges(totalcost);
        System.out.println("Green tax: " + greenTax);

        double registryCharges = Operation.registryCharges(totalcost);
        System.out.println("Registry charges : " + registryCharges);

        double societyDevelopment = Rate.societyDevelopment;
        System.out.println("Society Development :" + societyDevelopment);

        System.out.println("-----------------------------------------");

        double GrandTotal = totalcost + greenTax + registryCharges + societyDevelopment;
        System.out.println("Grand total :" + GrandTotal);
    }
}
