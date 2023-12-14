package org.example.model.triangle;

import org.example.model.ISquare;
import org.example.model.Shape;

import java.util.Objects;

public class Triangle extends Shape implements ISquare {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        super("треугольник");
        String message;
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            message = "Значения сторон должны быть положительными числами";
            throw new IllegalArgumentException(message);
        }
        if (firstSide + secondSide <= thirdSide ||
                firstSide + thirdSide <= secondSide ||
                secondSide + thirdSide <= firstSide) {
            message = "Сумма двух сторон треугольника должна превышать третью сторону";
            throw new IllegalArgumentException(message);
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getSquare() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - getFirstSide()) *
                (halfPerimeter - getSecondSide()) * (halfPerimeter - getThirdSide()));
    }

    @Override
    public Triangle clone(){
        return new Triangle(getFirstSide(), getSecondSide(), getThirdSide());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getFirstSide(), getFirstSide()) == 0 &&
                Double.compare(triangle.getSecondSide(), getSecondSide()) == 0 &&
                Double.compare(triangle.getThirdSide(), getThirdSide()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstSide(), getSecondSide(), getThirdSide());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append('\n');
        stringBuilder.append("Сторона 1: ").append(getFirstSide()).append('\n');
        stringBuilder.append("Сторона 2: ").append(getSecondSide()).append('\n');
        stringBuilder.append("Сторона 3: ").append(getThirdSide()).append('\n');
        stringBuilder.append("Периметр: ").append(getPerimeter()).append('\n');
        stringBuilder.append("Площадь: ").append(getSquare()).append('\n');
        return stringBuilder.toString();
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }
}