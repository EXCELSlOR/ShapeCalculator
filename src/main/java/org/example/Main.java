package org.example;

import org.example.model.triangle.EquilateralTriangle;
import org.example.model.triangle.IsoscelesTriangle;
import org.example.model.triangle.RectangularTriangle;
import org.example.model.triangle.Triangle;

public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(3, 4, 5);
            IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(3, 4);
            EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
            RectangularTriangle rectangularTriangle = new RectangularTriangle(3, 4);
            System.out.println(triangle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Программа завершена");
        }
    }
}