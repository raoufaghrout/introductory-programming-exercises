package com.twu.introductoryprogrammingexercises.primefactors;

import java.util.ArrayList;

public class PrimeFactorsGenerator {

    public ArrayList<Integer> generatePrimeFactors(int number) {
        ArrayList<Integer> listOfPrimeFactors = new ArrayList<Integer>();

        for (int i = 2; i < number; i++) {
            if (isFactor(number, i) && isPrime(i))
                listOfPrimeFactors.add(i);
        }

        return listOfPrimeFactors;
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (isFactor(number, i))
                return false;
        }

        return true;
    }

    private boolean isFactor(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber == 0;
    }
}
