package model.triangle;

public class RectangularTriangle extends Triangle {
    public RectangularTriangle(double firstCathet, double secondCathet) {
        super("Прямоугольный треугольник", firstCathet, secondCathet,
                Math.hypot(firstCathet, secondCathet));
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide / 2;
    }

    @Override
    protected void sidesToString(StringBuilder builder) {
        builder.append("\nПервый катет: ").append(firstSide);
        builder.append("\nВторой катет: ").append(secondSide);
        builder.append("\nГипотенуза: ").append(thirdSide);
    }

    public double getHypotenuse() {
        return getHypotenuse(firstSide, secondSide);
    }

    public static double getHypotenuse(double firstCathet, double secondCathet) {
        return Math.sqrt(Math.pow(firstCathet, 2) + Math.pow(secondCathet, 2));
    }
}
