package org.example;

import java.util.Vector;

/**
 * This class simulates a customer. He can own several different products that implement the
 * HausratproduktInterface.
 */
public class Kunde {

    public String name;

    private Vector<HausratproduktInterface> products;

    public Kunde(String name) {
        this.name = name;
        this.products = new Vector<>();
    }

    public void addProduct(HausratproduktInterface product) {
        products.add(product);
    }

    public String getName() {
        return name;
    }

    public void printProducts() {
        System.out.println(getName() + "'s Hausratprodukte:");
        for (HausratproduktInterface product : products) {
            System.out.println("- " + product.getProductName() + ": " + product.calculateInsuranceAmount() + " €");
        }
    }

    public Vector<HausratproduktInterface> getProducts() {
        return products;
    }
}
