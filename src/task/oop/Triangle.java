package task.oop;

public class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }


    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }


}