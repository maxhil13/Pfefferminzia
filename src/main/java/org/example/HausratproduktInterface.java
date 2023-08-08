package org.example;

/**
 * This interface acts as a simple and reduced interface for other classes that
 * want to use the Hausratprodukt classes.
 */
public interface HausratproduktInterface {

    /**
     * Calculates the total maximum insurance amount.
     *
     * @return The maximum insurance amount.
     */
    double calculateInsuranceAmount();

    /**
     * This method gets the name of the product.
     *
     * @return The name of the product.
     */
    String getProductName();
}
