package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KompaktTest {

    @Test
    void calculateInsuranceAmountTestSquareMeterBiggerOne() {
        assertEquals(96200, new Kompakt(148).calculateInsuranceAmount());
    }

    @Test
    void calculateInsuranceAmountTestSquareMeterBiggestDouble() {
        assertEquals(Double.POSITIVE_INFINITY, new Kompakt(Double.MAX_VALUE).calculateInsuranceAmount());
    }

    @Test
    void calculateInsuranceAmountTestSquareMeterSmallestDouble() {
        assertEquals(0, new Kompakt(Double.MIN_VALUE).calculateInsuranceAmount());
    }

    @Test
    void calculateInsuranceAmountTestSquareMeterSmallerOne() {
        assertEquals(-50700, new Kompakt(-78).calculateInsuranceAmount());
    }

    @Test
    void calculateInsuranceAmountTestSquareMeterEqualsZero() {
        assertEquals(0, new Kompakt(0).calculateInsuranceAmount());
    }

    @Test
    void calculateInsuranceAmountTestSquareMeterWithManyDecimalPlaces() {
        assertEquals(9600.17, new Kompakt(14.769487).calculateInsuranceAmount());
    }

    @Test
    void getProductNameTest() {
        assertEquals("Kompakt", new Kompakt(1).getProductName());
    }
}