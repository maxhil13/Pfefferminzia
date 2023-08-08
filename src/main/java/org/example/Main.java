package org.example;

public class Main {
    public static void main(String[] args) {
        Kunde martin = new Kunde("Martin");

        martin.addProduct(new Optimal(100));
        martin.addProduct(new Kompakt(120));
        martin.addProduct(new Optimal(50.245));

        martin.printProducts();

        System.out.println(Double.MIN_VALUE*700);

    }
}