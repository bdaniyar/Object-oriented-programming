package pr3.delivery.app;

import pr3.delivery.model.Car;
import pr3.delivery.model.Engine;
import pr3.delivery.model.Truck;
import pr3.delivery.model.Vehicle;
import pr3.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Engine e1 = new Engine("Gasoline", 150);
        Engine e2 = new Engine("Diesel", 320);

        Car car1 = new Car("Toyota Camry", 1000, e1, 5);
        Truck truck1 = new Truck("Volvo FH", 2000, e2, 12000);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(truck1);

        DeliveryService service = new DeliveryService();

        System.out.println("=== Print all vehicles ===");
        service.printAllVehicles(vehicles);

        System.out.println("\n=== Calculate all deliveries (polymorphism) ===");
        service.calculateAllDeliveries(vehicles);

        System.out.println("\n=== Total cost ===");
        double total = service.calculateTotalCost(vehicles);
        System.out.println("Total: " + total);

        // --- демонстрация overload (не через Vehicle, а через конкретный тип) ---
        System.out.println("\n=== Overload demo ===");
        System.out.println("Car with extra weight (20.5): " + car1.calculateDeliveryCost(20.5));
        System.out.println("Truck with distance+fuelPrice (120, 3.2): " + truck1.calculateDeliveryCost(120, 3.2));
    }
}