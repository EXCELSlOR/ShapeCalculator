package org.example.model.quadrangle;

import org.example.model.Shape;

import java.util.Objects;

public class Quadrangle extends Shape {

    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double fourthSide;

    public Quadrangle(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super("четырёхугольник");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide + fourthSide;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append('\n');
        stringBuilder.append("Сторона 1: ").append(getFirstSide()).append('\n');
        stringBuilder.append("Сторона 2: ").append(getSecondSide()).append('\n');
        stringBuilder.append("Сторона 3: ").append(getThirdSide()).append('\n');
        stringBuilder.append("Сторона 4: ").append(getFourthSide()).append('\n');
        stringBuilder.append("Периметр: ").append(getPerimeter()).append('\n');
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadrangle that = (Quadrangle) o;
        return Double.compare(that.getFirstSide(), getFirstSide()) == 0 &&
                Double.compare(that.getSecondSide(), getSecondSide()) == 0 &&
                Double.compare(that.getThirdSide(), getThirdSide()) == 0 &&
                Double.compare(that.getFourthSide(), getFourthSide()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide, thirdSide, fourthSide);
    }

    @Override
    protected Quadrangle clone() {
        return new Quadrangle(firstSide, secondSide, thirdSide, fourthSide);
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

    public double getFourthSide() {
        return fourthSide;
    }
}