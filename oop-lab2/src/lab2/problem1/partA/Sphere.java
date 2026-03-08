package lab2.problem1.partA;

public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double r) {
        this.radius = r;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}