package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptimalTest {

    @Test
    void calculateInsuranceAmountTestSquareMeterBiggerOne() {
        assertEquals(33600, new Optimal(48).calculateInsuranceAmount());
    }

    @Test
    void calculateInsuranceAmountTestSquareMeterBiggestDouble() {
        assertEquals(Double.POSITIVE_INFINITY, new Optimal(Double.MAX_VALUE).calculateInsuranceAmount());
    }

    @Test
    void calculateInsuranceAmountTestSquareMeterSmallestDouble() {
        assertEquals(0, new Optimal(Double.MIN_VALUE).calculateInsuranceAmount());
    }

    @Test
    void calculateInsuranceAmountTestSquareMeterSmallerOne() {
        assertEquals(-54600, new Optimal(-78).calculateInsuranceAmount());
    }

    @Test
    void calculateInsuranceAmountTestSquareMeterEqualsZero() {
        assertEquals(0, new Optimal(0).calculateInsuranceAmount());
    }

    @Test
    void calculateInsuranceAmountTestSquareMeterWithManyDecimalPlaces() {
        assertEquals(10338.64, new Optimal(14.769487).calculateInsuranceAmount());
    }

    @Test
    void getProductNameTest() {
        assertEquals("Optimal", new Optimal(1).getProductName());
    }
}