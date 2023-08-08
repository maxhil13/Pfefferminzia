package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Optimal extends Hausratprodukt {

    private final String PRODUCT_NAME = "Optimal";

    public Optimal(double squareMeter) {
        super(BigDecimal.valueOf(700), BigDecimal.valueOf(squareMeter));
    }

    /**
     * Calculates the insurance amount by multiplying the square meters with the insurance amount per
     * square meter.
     *
     * @return The insurance amount rounded to two decimal places.
     */
    @Override
    public double calculateInsuranceAmount() {
        BigDecimal result = INSURANCE_AMOUNT_PER_SQUARE_METER.multiply(squareMeter).setScale(2, RoundingMode.HALF_UP);

        return result.doubleValue();
    }

    @Override
    public String getProductName() {
        return PRODUCT_NAME;
    }
}
