package lab2.problem1.partC;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Car> cars = new HashSet<>();

        Car c1 = new Car("Toyota", 2020, "Camry");
        Car c2 = new Car("Toyota", 2020, "Camry");

        cars.add(c1);
        cars.add(c2);

        System.out.println("Size: " + cars.size());

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}