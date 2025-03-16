package task.oop;

public class Circle extends Figure {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}