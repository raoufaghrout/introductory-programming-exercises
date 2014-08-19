package com.twu.introductoryprogrammingexercises.fizzbuzz;

public class FizzBuzzPresenter {

    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (divisibleByThree(i) && divisibleByFive(i)) {
                print("FizzBuzz");
            } else if (divisibleByThree(i)) {
                print("Fizz");
            } else if (divisibleByFive(i)) {
                print("Buzz");
            } else {
                print(i);
            }
        }
    }

    private boolean divisibleByThree(int number) {
        return number % 3 == 0;
    }

    private boolean divisibleByFive(int number) {
        return number % 5 == 0;
    }

    private void print(Object o) {
        System.out.println(o);
    }
}
