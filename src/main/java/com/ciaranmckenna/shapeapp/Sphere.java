package com.ciaranmckenna.shapeapp;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sphere extends Shape implements Volume{

    public Sphere() {
    }

    public Sphere(String name, double length) {
        super(name, length);
    }

    @Override
    public BigDecimal calculateVolume(double length) {
        BigDecimal answer = BigDecimal.valueOf(4 * Math.PI * Math.pow(length, 3) / 3).setScale(2, RoundingMode.HALF_UP).stripTrailingZeros();
        System.out.println(this.getName() + ": " + answer);
        return answer;
    }

}