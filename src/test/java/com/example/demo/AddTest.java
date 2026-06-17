package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {

    private int add(int a, int b) {
        return a + b;
    }

    @Test
    void testAdd() {
        assertEquals(3, add(1, 2));
        assertEquals(0, add(-1, 1));
        assertEquals(-5, add(-3, -2));
    }
}
