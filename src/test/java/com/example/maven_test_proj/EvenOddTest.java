package com.example.maven_test_proj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertTrue(EvenOdd.isEven(4));
    }

    @Test
    void testOddNumber() {
        assertFalse(EvenOdd.isEven(7));
    }

    @Test
    void testZeroIsEven() {
        assertTrue(EvenOdd.isEven(0));
    }

    @Test
    void testNegativeOdd() {
        assertFalse(EvenOdd.isEven(-3));
    }

    @Test
    void testCheckMessages() {
        assertEquals("10 is Even", EvenOdd.check(10));
        assertEquals("5 is Odd", EvenOdd.check(5));
    }
}