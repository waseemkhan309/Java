import java.util.LinkedList;
import java.util.List;

interface IShape {
    double getArea();
    void draw();
}

class Square implements IShape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square...");
    }
}

class Rectangle implements IShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

class Triangle implements IShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle...");
    }
}

public class  polymorphismGenericShapeCollection{
    public static void main(String[] args) {
        List<IShape> shapes = new LinkedList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                shapes.add(new Square(i));
            } else if (i % 3 == 1) {
                shapes.add(new Rectangle(i, i + 1));
            } else {
                shapes.add(new Triangle(i, i + 1));
            }
        }

        for (IShape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.getArea());
            System.out.println();
        }
    }
}
