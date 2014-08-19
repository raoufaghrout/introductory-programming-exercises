package com.twu.introductoryprogrammingexercises.primefactors;

public class PrimeFactorsController {

    public static void main(String[] args) {
        PrimeFactorsGenerator primeFactorsGenerator = new PrimeFactorsGenerator();
        PrimeFactorsPresenter.print(primeFactorsGenerator.generatePrimeFactors(30));
    }
}
