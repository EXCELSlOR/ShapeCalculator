package org.example.model.triangle;

public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(double side) {
        super(side, side, side);
        setName("равносторонний треугольник");
    }

    @Override
    public double getPerimeter() {
        return getFirstSide() * 3;
    }

    @Override
    public double getSquare() {
        return Math.pow(getFirstSide(), 2) * Math.sqrt(3) / 4;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Сторона: ").append(getFirstSide()).append('\n');
        stringBuilder.append("Периметр: ").append(getPerimeter()).append('\n');
        stringBuilder.append("Площадь: ").append(getSquare()).append('\n');
        return stringBuilder.toString();
    }
}
