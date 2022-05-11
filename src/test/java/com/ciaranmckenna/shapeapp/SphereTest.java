package com.ciaranmckenna.shapeapp;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    @Test
    void calculateVolume() {
        // given
        Sphere sphereTest = new Sphere("SphereTest", 5);
        BigDecimal actual = BigDecimal.valueOf(4 * Math.PI * Math.pow(5, 3) / 3).setScale(2, RoundingMode.HALF_UP).stripTrailingZeros();

        // then
        BigDecimal expected = sphereTest.calculateVolume(sphereTest.getLength());

        // when
        assertEquals(expected, actual);
    }
}