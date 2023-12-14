package org.example.model.quadrangle;

import org.example.model.ISquare;

import java.util.Objects;

public class Parallelogram extends Quadrangle implements ISquare {

    private double height;

    public Parallelogram(double side, double base, double height) {
        super(side, base, side, base);
        setName("параллелограмм");
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return ((getFirstSide() + getSecondSide()) * 2);
    }

    @Override
    public double getSquare() {
        return getFirstSide() * getHeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return Double.compare(that.getFirstSide(), getFirstSide()) == 0 &&
                Double.compare(that.getSecondSide(), getSecondSide()) == 0 &&
                Double.compare(that.getThirdSide(), getThirdSide()) == 0 &&
                Double.compare(that.getFourthSide(), getFourthSide()) == 0 &&
                Double.compare(that.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstSide(), getSecondSide(), getThirdSide(), getFourthSide());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName()).append('\n');
        stringBuilder.append("Боковая сторона: ").append(getFirstSide()).append('\n');
        stringBuilder.append("Основание: ").append(getSecondSide()).append('\n');
        stringBuilder.append("Высота: ").append(getHeight()).append('\n');
        stringBuilder.append("Периметр: ").append(getPerimeter()).append('\n');
        stringBuilder.append("Площадь: ").append(getSquare()).append('\n');
        return stringBuilder.toString();
    }

    @Override
    protected Parallelogram clone() {
        return new Parallelogram(getFirstSide(), getSecondSide(), getHeight());
    }

    public double getHeight() {
        return height;
    }
}