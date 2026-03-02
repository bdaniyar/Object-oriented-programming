package pr3.delivery.model;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String model, double baseCost, Engine engine, int numberOfSeats) {
        super(model, baseCost, engine);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateDeliveryCost() {
        return baseCost + numberOfSeats * 50.0;
    }

    // overload
    public double calculateDeliveryCost(double extraWeight) {
        return calculateDeliveryCost() + extraWeight * 10.0;
    }

    @Override
    public String getVehicleInfo() {
        return "Car{model='" + model + "', seats=" + numberOfSeats + ", baseCost=" + baseCost + ", " + engine.getEngineInfo() + "}";
    }
}