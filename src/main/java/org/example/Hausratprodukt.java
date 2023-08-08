package org.example;

import java.math.BigDecimal;

public abstract class Hausratprodukt implements HausratproduktInterface {

    protected final BigDecimal INSURANCE_AMOUNT_PER_SQUARE_METER;

    protected BigDecimal squareMeter;

    public Hausratprodukt(BigDecimal insuranceAmountPerSquareMeter, BigDecimal squareMeter) {
        this.INSURANCE_AMOUNT_PER_SQUARE_METER = insuranceAmountPerSquareMeter;
        this.squareMeter = squareMeter;
    }

    public BigDecimal getINSURANCE_AMOUNT_PER_SQUARE_METER() {
        return INSURANCE_AMOUNT_PER_SQUARE_METER;
    }

    public BigDecimal getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(BigDecimal squareMeter) {
        this.squareMeter = squareMeter;
    }
}
