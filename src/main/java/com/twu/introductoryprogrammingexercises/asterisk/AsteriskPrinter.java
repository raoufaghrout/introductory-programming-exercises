package com.twu.introductoryprogrammingexercises.asterisk;

public class AsteriskPrinter {

    public void printOneAsterisk() {
        System.out.println("*");
    }

    public void printAsterisksOnOneLine(int length) {
        for (int i = 0; i < length; i++)
            System.out.print("*");
        System.out.println();
    }

    public void printAsterisksOnNewLines(int depth) {
        for (int i = 0; i < depth; i++)
            System.out.println("*");
    }

    public void printAsteriskRightTriangle(int depth) {
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void printAsteriskIsoscelesTriangle(int depth) {
        int baseSize = (2 * depth) - 1;

        for (int i = 0; i < depth; i++) {
            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (baseSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void printAsteriskDiamond(int depth) {
        int centreSize = (2 * depth) - 1;

        for (int i = 0; i < depth; i++) {
            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }

        int iterations = depth - 1;

        for (int i = iterations; i > 0; i--) {
            int asteriskCount = (2 * i) - 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void printAsteriskDiamondWithName(int depth) {
        int centreSize = (2 * depth) - 1;

        for (int i = 0; i < depth; i++) {
            if (i == depth -1) {
                System.out.println("Raouf");
                break;
            }

            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }

        int iterations = depth - 1;

        for (int i = iterations; i > 0; i--) {
            int asteriskCount = (2 * i) - 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
