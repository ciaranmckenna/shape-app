package com.ciaranmckenna.shapeapp;

import java.math.BigDecimal;

public class Cube extends Shape implements Volume{

    public Cube() {
    }

    public Cube(String name, double length) {
        super(name, length);
    }

    @Override
    public BigDecimal calculateVolume(double length) {
        BigDecimal bigDecimal = BigDecimal.valueOf(Math.pow(length, 3)).stripTrailingZeros();
        System.out.println(this.getName() +": " +  bigDecimal);
        return bigDecimal;
    }

}
