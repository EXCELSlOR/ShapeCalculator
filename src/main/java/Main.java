import model.Shape;
import model.triangle.EquilateralTriangle;
import model.triangle.IsoscelesTriangle;
import model.triangle.RectangularTriangle;
import model.triangle.Triangle;
import model.quadrangle.Parallelogram;
import model.quadrangle.Quadrangle;
import model.quadrangle.Trapeze;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        try {
            shapes.add(new Triangle(4, 5, 6));
            shapes.add(new IsoscelesTriangle(5, 4));
            shapes.add(new EquilateralTriangle(3));
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
        shapes.add(new RectangularTriangle(3, 4));
        shapes.add(new Quadrangle(2, 4, 3, 5));
        shapes.add(new Trapeze(5, 2, 5, 8));
        shapes.add(new Parallelogram(5, 8, 4));
        for (Shape shape : shapes) {
            System.out.println(shape + "\n");
        }
    }
}