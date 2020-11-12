package model.triangle;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double side, double base) {
        super("Равнобедренный треугольник", side, side, base);
    }

    @Override
    public double getPerimeter() {
        return firstSide * 2 + thirdSide;
    }

    @Override
    public double getSquare() {
        return thirdSide * Math.sqrt(Math.pow(firstSide, 2) -
                Math.pow(thirdSide, 2) / 4) / 2;
    }

    @Override
    protected void sidesToString(StringBuilder builder) {
        builder.append("\nБоковая сторона: ").append(firstSide);
        builder.append("\nОснование: ").append(thirdSide);
    }
}
