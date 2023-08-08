package org.example;

import java.util.Vector;

/**
 * This class simulates a customer. He can own several different products that implement the
 * HausratproduktInterface.
 */
public class Kunde {

    private String name;

    private Vector<HausratproduktInterface> products;

    /**
     * This constructor gets a name as a parameter and sets it to the corresponding variable.
     * Then it initializes the vector "products" where all the products of that customer can be stored.
     *
     * @param name The name of the product.
     */
    public Kunde(String name) {
        this.name = name;
        this.products = new Vector<>();
    }

    /**
     * Adds a product to the products vector.
     *
     * @param product A product from type HausratproduktInterface.
     */
    public void addProduct(HausratproduktInterface product) {
        products.add(product);
    }

    /**
     * This is a getter method for the variable name.
     *
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Prints all products stored in the products vector.
     */
    public void printProducts() {
        System.out.println(getName() + "'s Hausratprodukte:");
        for (HausratproduktInterface product : products) {
            System.out.println("- " + product.getProductName() + ": " + product.calculateInsuranceAmount() + " €");
        }
    }

    /**
     * This is a getter method for the products vector.
     *
     * @return The products purchased by the customer.
     */
    public Vector<HausratproduktInterface> getProducts() {
        return products;
    }
}
