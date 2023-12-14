package org.example.model.quadrangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParallelogramTest {

    Parallelogram parallelogram;

    @Before
    public void setUp() throws Exception {
        parallelogram = new Parallelogram(4, 5, 3);
    }

    @Test
    public void getFirstSide() {
        assertEquals(4, parallelogram.getFirstSide(), 0);
    }

    @Test
    public void getSecondSide() {
        assertEquals(5, parallelogram.getSecondSide(), 0);
    }

    @Test
    public void getThirdSide() {
        assertEquals(4, parallelogram.getThirdSide(), 0);
    }

    @Test
    public void getFourthSide() {
        assertEquals(5, parallelogram.getFourthSide(), 0);
    }

    @Test
    public void getHeight() {
        assertEquals(3, parallelogram.getHeight(), 0);
    }

    @Test
    public void getPerimeter() {
        assertEquals(18, parallelogram.getPerimeter(), 0);
    }

    @Test
    public void getSquare() {
        assertEquals(12, parallelogram.getSquare(), 0);
    }

    @Test
    public void testEquals() {
        assertEquals(parallelogram, new Parallelogram(4, 5, 3));
        assertNotEquals(parallelogram, new Parallelogram(5,4,3));
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testToString() {
        String expected = """
                параллелограмм
                Боковая сторона: 4.0
                Основание: 5.0
                Высота: 3.0
                Периметр: 18.0
                Площадь: 12.0
                """;
        assertEquals(expected, parallelogram.toString());
    }

    @Test
    public void testClone() {
        Parallelogram cloneParallelogram = parallelogram.clone();
        assertEquals("параллелограмм", cloneParallelogram.getName());
        assertEquals(4, cloneParallelogram.getFirstSide(), 0);
        assertEquals(5, cloneParallelogram.getSecondSide(), 0);
        assertEquals(4, cloneParallelogram.getThirdSide(), 0);
        assertEquals(5, cloneParallelogram.getFourthSide(), 0);
        assertEquals(3, cloneParallelogram.getHeight(), 0);
    }
}