package org.example.model.triangle;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double side, double base) {
        super(side, side, base);
        setName("равнобедренный треугольник");
    }

    @Override
    public double getPerimeter() {
        return getFirstSide() * 2 + getThirdSide();
    }

    @Override
    public double getSquare() {
        return getThirdSide() * Math.sqrt(Math.pow(getFirstSide(), 2) -
                Math.pow(getThirdSide(), 2) / 4) / 2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Боковая сторона: ").append(getFirstSide()).append('\n');
        stringBuilder.append("Основание: ").append(getThirdSide()).append('\n');
        stringBuilder.append("Периметр: ").append(getPerimeter()).append('\n');
        stringBuilder.append("Площадь: ").append(getSquare()).append('\n');
        return stringBuilder.toString();
    }
}
