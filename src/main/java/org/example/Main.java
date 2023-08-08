package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        Here you can see the benefit of my design choices. You can add different products to a
        customer with a single method.
         */

        Kunde martin = new Kunde("Martin");

        martin.addProduct(new Optimal(100));
        martin.addProduct(new Kompakt(120));
        martin.addProduct(new Optimal(50.245));

        martin.printProducts();
    }
}