package com.mycompany.asmtechconstructionprivatelimitedsimple;

public class AsmtechConstructionPrivateLimitedSimple {

    public static void main(String[] args) {
        Plot lokesh = new Plot(30, 50);
        Estimation.printEstimatePlot(lokesh);

        System.out.println("=================================");

        Office rishika = new Office(30, 50);
        Estimation.printEstimateOffice(rishika);

        System.out.println("=================================");

        Flat mahesh = new Flat(500);
        Estimation.printEstimateFlat(mahesh);

    }
}
