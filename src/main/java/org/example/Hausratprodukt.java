package org.example;

import java.math.BigDecimal;

/**
 * This class provides functionality that all the Hausratprodukte have in common.
 * Furthermore, this class implements the HausratproduktInterface, which means that all classes
 * that inherit this class also has to implement the HausratproduktInterface.
 */
public abstract class Hausratprodukt implements HausratproduktInterface {

    protected final BigDecimal INSURANCE_AMOUNT_PER_SQUARE_METER;

    protected BigDecimal squareMeter;

    protected final String NAME;

    /**
     * The constructor gets the insurance amount per square meter, the square meter of the real estate
     * and the product name and stores them in the corresponding variables.
     *
     * @param insuranceAmountPerSquareMeter The maximum insurance amount per square meter.
     * @param squareMeter The size of the insured real estate.
     * @param name The product name.
     */
    public Hausratprodukt(BigDecimal insuranceAmountPerSquareMeter, BigDecimal squareMeter, String name) {
        this.INSURANCE_AMOUNT_PER_SQUARE_METER = insuranceAmountPerSquareMeter;
        this.squareMeter = squareMeter;
        this.NAME = name;
    }

    /**
     * This is a getter method for the insurance amount per square meter.
     *
     * @return Insurance amount per square meter.
     */
    public BigDecimal getINSURANCE_AMOUNT_PER_SQUARE_METER() {
        return INSURANCE_AMOUNT_PER_SQUARE_METER;
    }

    /**
     * This is a getter method for the square meter of the real estate.
     *
     * @return Square meter of the real estate.
     */
    public BigDecimal getSquareMeter() {
        return squareMeter;
    }

    /**
     * This method sets the square meter to a specified value.
     *
     * @param squareMeter The square meter that you want to store in the variable squareMeter.
     */
    public void setSquareMeter(BigDecimal squareMeter) {
        this.squareMeter = squareMeter;
    }

    /**
     * This is a getter method for the product name.
     *
     * @return The product name.
     */
    public String getNAME() {
        return NAME;
    }
}
