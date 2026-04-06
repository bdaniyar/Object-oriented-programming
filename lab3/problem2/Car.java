package problem2;

class Car implements AdvancedMoveable {

    public void move() {
        System.out.println("Car is driving");
    }

    public void accelerate(int speed) {
        System.out.println("Car accelerates to " + speed + " km/h");
    }
}