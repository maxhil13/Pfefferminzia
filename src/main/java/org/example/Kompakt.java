package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class represents the Kompakt product. The insurance amount per square meter is 650.
 * It inherits from Hausratprodukt and therefore implements the HausratproduktInterface.
 */
public class Kompakt extends Hausratprodukt {

    /**
     * This constructor sets the square meter of the real estate and the insurance amount per square meter
     * of the Kompakt product by calling the constructor of its parent class. Furthermore, it sets the
     * product name to "Kompakt".
     *
     * @param squareMeter The square meter of the real estate.
     */
    public Kompakt(double squareMeter) {
        super(BigDecimal.valueOf(650), BigDecimal.valueOf(squareMeter), "Kompakt");
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

    /**
     * This method gets the name of the product.
     *
     * @return The name of the product.
     */
    @Override
    public String getProductName() {
        return getNAME();
    }
}
