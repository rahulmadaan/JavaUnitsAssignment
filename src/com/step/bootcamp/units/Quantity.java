package com.step.bootcamp.units;

import java.math.BigDecimal;

public class Quantity {
    private BigDecimal value;
    private Unit unit;

    public Quantity(BigDecimal value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Quantity quantity2) {
        BigDecimal firstValue = this.unit.valueInBaseUnit(this.value);
        BigDecimal secondValue = quantity2.unit.valueInBaseUnit(quantity2.value);
        return firstValue.intValue() == secondValue.intValue();
    }

    @Override
    public boolean equals(Object quantity) {
        if (this == quantity) return true;
        if (quantity == null || getClass() != quantity.getClass()) return false;
        Quantity quantity2 = (Quantity) quantity;
        BigDecimal firstValue = this.unit.valueInBaseUnit(this.value);
        BigDecimal secondValue = quantity2.unit.valueInBaseUnit(quantity2.value);
        return firstValue.intValue() == secondValue.intValue();
    }

}
