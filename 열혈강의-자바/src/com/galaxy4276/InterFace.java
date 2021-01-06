package com.galaxy4276;

interface Printable {
    void print(String doc);
    default void printCMYK(String doc) {
        System.out.println(doc);
    }
}

interface ColorPrintable extends Printable {
    void printCMYK(String doc);
}

class Prn204Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From MD-204 Model");
        System.out.println(doc);
    }
}

class Pr731Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From MD-731 Model");
        System.out.println(doc);
    }
}

class Prn909Drv implements ColorPrintable {
    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver...");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 black & white ver...");
        System.out.println(doc);
    }
}


public class InterFace {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        Printable prn = new Prn204Drv();
        prn.print(myDoc);
        prn.printCMYK(myDoc + " Hello");
        System.out.println();

        prn = new Pr731Drv();
        prn.print(myDoc);
        System.out.println();

        ColorPrintable colorPrn = new Prn909Drv();
        colorPrn.printCMYK(myDoc);
    }
}
