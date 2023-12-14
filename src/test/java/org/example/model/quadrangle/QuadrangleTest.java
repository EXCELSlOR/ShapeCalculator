package org.example.model.quadrangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadrangleTest {

    Quadrangle quadrangle;

    @Before
    public void setUp() throws Exception {
        quadrangle = new Quadrangle(3, 4, 5, 6);
    }

    @Test
    public void getPerimeter() {
        assertEquals(18, quadrangle.getPerimeter(), 0);
    }

    @Test
    public void testClone() {
        Quadrangle cloneQuadrangle = quadrangle.clone();
        assertEquals("четырёхугольник", cloneQuadrangle.getName());
        assertEquals(3, cloneQuadrangle.getFirstSide(), 0);
        assertEquals(4, cloneQuadrangle.getSecondSide(), 0);
        assertEquals(5, cloneQuadrangle.getThirdSide(), 0);
        assertEquals(6, cloneQuadrangle.getFourthSide(), 0);
    }

    @Test
    public void testEquals() {
        assertEquals(quadrangle, new Quadrangle(3, 4, 5, 6));
        assertNotEquals(quadrangle, new Quadrangle(4,5,6,3));
        assertNotEquals(quadrangle, new Quadrangle(5,6,3,4));
        assertNotEquals(quadrangle, new Quadrangle(6, 3,4,5));
    }

    @Test
    public void testHashCode() {
        assertEquals(-509995135, quadrangle.hashCode());
    }

    @Test
    public void testToString() {
        String expected = """
                четырёхугольник
                Сторона 1: 3.0
                Сторона 2: 4.0
                Сторона 3: 5.0
                Сторона 4: 6.0
                Периметр: 18.0
                """;
        assertEquals(expected, quadrangle.toString());
    }

    @Test
    public void getFirstSide() {
        assertEquals(3, quadrangle.getFirstSide(), 0);
    }

    @Test
    public void getSecondSide() {
        assertEquals(4, quadrangle.getSecondSide(), 0);
    }

    @Test
    public void getThirdSide() {
        assertEquals(5, quadrangle.getThirdSide(), 0);
    }

    @Test
    public void getFourthSide() {
        assertEquals(6, quadrangle.getFourthSide(), 0);
    }
}