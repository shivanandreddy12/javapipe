package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App c = new App();
        assertEquals(15, c.calculator(10, 5));
    }

    @Test
    public void testSubtract() {
        App c = new App();
        assertEquals(5, c.substract(10, 5));
    }
}
