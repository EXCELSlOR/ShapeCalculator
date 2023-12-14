package org.example.model.triangle;

public class RectangularTriangle extends Triangle {

    public RectangularTriangle(double firstCatheter, double secondCatheter) {
        super(firstCatheter, secondCatheter, Math.hypot(firstCatheter,secondCatheter));
    }

    @Override
    public double getSquare() {
        return getFirstSide() * getSecondSide() / 2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Катет 1: ").append(getFirstSide()).append('\n');
        stringBuilder.append("Катет 2: ").append(getSecondSide()).append('\n');
        stringBuilder.append("Гипотенуза 3: ").append(getThirdSide()).append('\n');
        stringBuilder.append("Периметр: ").append(getPerimeter()).append('\n');
        stringBuilder.append("Площадь: ").append(getSquare()).append('\n');
        return stringBuilder.toString();
    }
}
