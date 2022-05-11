package com.ciaranmckenna.shapeapp;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    @Test
    void calculateVolume() {
        // given
        Cube cubeTest = new Cube("Cube", 3.0);
        BigDecimal actual = BigDecimal.valueOf(Math.pow(3, 3)).stripTrailingZeros();

        // then
        BigDecimal expected = cubeTest.calculateVolume(cubeTest.getLength());

        // when
        assertEquals(expected, actual);
    }
}