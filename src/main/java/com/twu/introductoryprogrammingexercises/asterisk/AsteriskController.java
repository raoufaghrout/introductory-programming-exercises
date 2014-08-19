package com.twu.introductoryprogrammingexercises.asterisk;

public class AsteriskController {

    public static void main(String[] args) {
        AsteriskPrinter asteriskPrinter = new AsteriskPrinter();
        asteriskPrinter.printOneAsterisk();
        asteriskPrinter.printAsterisksOnOneLine(8);
        asteriskPrinter.printAsterisksOnNewLines(3);
        asteriskPrinter.printAsteriskRightTriangle(3);
        asteriskPrinter.printAsteriskIsoscelesTriangle(3);
        asteriskPrinter.printAsteriskDiamond(3);
        asteriskPrinter.printAsteriskDiamondWithName(3);
    }
}
