package org.example.model.triangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle(3, 4, 5);
    }

    @Test
    public void getPerimeter() {
        assertEquals(12, triangle.getPerimeter(), 0);
    }

    @Test
    public void getSquare() {
        assertEquals(6, triangle.getSquare(), 0);
    }

    @Test
    public void testClone() {
        Triangle cloneTriangle = triangle.clone();
        assertEquals("треугольник", cloneTriangle.getName());
        assertEquals(3, cloneTriangle.getFirstSide(), 0);
        assertEquals(4, cloneTriangle.getSecondSide(), 0);
        assertEquals(5, cloneTriangle.getThirdSide(), 0);
    }

    @Test
    public void testEquals() {
        assertEquals(triangle, new Triangle(3, 4, 5));
        assertNotEquals(triangle, new Triangle(4,5,3));
        assertNotEquals(triangle, new Triangle(5,3,4));
    }

    @Test
    public void testHashCode() {
        assertEquals(1611428959, triangle.hashCode());
    }

    @Test
    public void testToString() {
        String expected = """
                треугольник
                Сторона 1: 3.0
                Сторона 2: 4.0
                Сторона 3: 5.0
                Периметр: 12.0
                Площадь: 6.0
                """;
        assertEquals(expected, triangle.toString());
    }

    @Test
    public void getFirstSide() {
        assertEquals(3, triangle.getFirstSide(), 0);
    }

    @Test
    public void getSecondSide() {
        assertEquals(4, triangle.getSecondSide(), 0);
    }

    @Test
    public void getThirdSide() {
        assertEquals(5, triangle.getThirdSide(), 0);
    }
}