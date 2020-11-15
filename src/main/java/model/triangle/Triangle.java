package model.triangle;

import model.ISquare;
import model.Shape;
import model.utils.ValidateUtil;

import java.util.Objects;

public class Triangle extends Shape implements ISquare {

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;

    protected Triangle(String name, double firstSide, double secondSide, double thirdSide) {
        super(name);
        validate(firstSide, secondSide, thirdSide);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this("Треугольник", firstSide, secondSide, thirdSide);
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getSquare() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nПервая сторона: ").append(firstSide);
        builder.append("\nВторая сторона: ").append(secondSide);
        builder.append("\nТретья сторона: ").append(thirdSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        if (Double.compare(triangle.firstSide, firstSide) != 0) return false;
        if (Double.compare(triangle.secondSide, secondSide) != 0) return false;
        return Double.compare(triangle.thirdSide, thirdSide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide, thirdSide);
    }

    private void validate(double firstSide, double secondSide, double thirdSide) {
        StringBuilder builder = new StringBuilder();
        if (!ValidateUtil.isValidSide(firstSide)) {
            builder.append("Неверное значение первой стороны!\n");
        }
        if (!ValidateUtil.isValidSide(secondSide)) {
            builder.append("Неверное значение второй стороны!\n");
        }
        if (!ValidateUtil.isValidSide(thirdSide)) {
            builder.append("Неверное значение третьей стороны!\n");
        }
        if (!ValidateUtil.isValidTriangle(firstSide, secondSide, thirdSide)) {
            builder.append("Невозможно построить треугольник с заданными сторонами!\n");
        }
        String message = builder.toString();
        if (message.length() > 0) {
            message += "\b";
            throw new IllegalArgumentException(message);
        }
    }
}