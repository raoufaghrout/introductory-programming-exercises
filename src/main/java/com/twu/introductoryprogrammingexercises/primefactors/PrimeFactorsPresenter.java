package com.twu.introductoryprogrammingexercises.primefactors;

import java.util.ArrayList;

public class PrimeFactorsPresenter {

    public static void print(ArrayList<Integer> listOfFactors) {
        for (Integer integer : listOfFactors)
            System.out.print(integer + " ");
    }
}
