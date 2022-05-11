package com.ciaranmckenna.shapeapp;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class TetrahedronTest {

    @Test
    void calculateVolume() {
        // given
        Tetrahedron tetrahedronTest = new Tetrahedron("Tetrahedron", 5);
        BigDecimal actual = BigDecimal.valueOf((Math.pow(5, 3) / (6 * Math.sqrt(2)))).setScale(2, RoundingMode.HALF_UP).stripTrailingZeros();

        // then
        BigDecimal expected = tetrahedronTest.calculateVolume(tetrahedronTest.getLength());

        // when
        assertEquals(expected, actual);
    }
}