package com.step.bootcamp.units;

import java.math.BigDecimal;

public class Unit {
    private BigDecimal ratio;

    public static final Unit MM = new Unit(BigDecimal.valueOf(0.04));
    public static final Unit CM = new Unit(BigDecimal.valueOf(0.4));
    public static final Unit FEET = new Unit(BigDecimal.valueOf(12));
    public static final Unit INCH = new Unit(BigDecimal.ONE);

    private Unit(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public BigDecimal valueInBaseUnit(BigDecimal value) {
        return value.multiply(this.ratio);
    }
}
