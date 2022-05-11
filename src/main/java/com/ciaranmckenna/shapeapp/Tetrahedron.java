package com.ciaranmckenna.shapeapp;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tetrahedron extends Shape implements Volume{

    public Tetrahedron() {
    }

    public Tetrahedron(String name, double length) {
        super(name, length);
    }

    @Override
    public BigDecimal calculateVolume(double length) {
        BigDecimal volume =  BigDecimal.valueOf((Math.pow(length, 3) / (6 * Math.sqrt(2)))).setScale(2, RoundingMode.HALF_UP).stripTrailingZeros();
        System.out.println(this.getName() + ": " + volume);
        return volume;
    }
}