package com.step.bootcamp.units;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void shouldReturnTrueForSameInchAndFeet() {
        Quantity twelveInches = new Quantity(new BigDecimal(12), Unit.INCH);
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        assertEquals(oneFeet, twelveInches);
    }

    @Test
    void shouldReturnFalseForDifferentQuantities() {
        Quantity eighteenInches = new Quantity(new BigDecimal(18), Unit.INCH);
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        assertNotEquals(eighteenInches, oneFeet);
    }

    @Test
    void shouldReturnTrueForSameCMAndInch() {
        Quantity oneCM = new Quantity(new BigDecimal(1), Unit.CM);
        Quantity pointFourInch = new Quantity(BigDecimal.valueOf(0.4), Unit.INCH);
        assertEquals(oneCM, pointFourInch);
    }

    @Test
    void shouldReturnTrueForSameCMAndMM() {
        Quantity oneCM = new Quantity(BigDecimal.valueOf(1), Unit.CM);
        Quantity tenMM = new Quantity(BigDecimal.valueOf(10), Unit.MM);
        assertEquals(oneCM, tenMM);
    }

}
