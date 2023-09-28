package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Toyota", "Corolla", 1997);
    }

    @Test
    void testStart() {
        car.start();
        assertTrue(car.isRunning());
    }

    @Test
    void testStop() {
        car.start();
        car.stop();
        assertFalse(car.isRunning());
    }

    @Test
    void testIsRunningInitiallyFalse() {
        assertFalse(car.isRunning());
    }

    @Test
    void testGetMakeAndModel() {
        assertEquals("Toyota Corolla", car.getMakeAndModel());
    }
}
