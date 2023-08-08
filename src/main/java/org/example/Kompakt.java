package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Kompakt extends Hausratprodukt {

    private final String PRODUCT_NAME = "Kompakt";

    public Kompakt(double squareMeter) {
        super(BigDecimal.valueOf(650), BigDecimal.valueOf(squareMeter));
    }

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
