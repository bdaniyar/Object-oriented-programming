package lab2.problem1.partA;

public class Cube extends Shape3D {

    private double side;

    public Cube(double s) {
        this.side = s;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }
}