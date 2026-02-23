package pr3.delivery.model;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String model, double baseCost, Engine engine, int numberOfSeats) {
        super(model, baseCost, engine);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateDeliveryCost() {
        // пример логики: базовая цена + наценка за места
        return baseCost + numberOfSeats * 50.0;
    }

    // overload
    public double calculateDeliveryCost(double extraWeight) {
        // пример: доп вес увеличивает цену
        return calculateDeliveryCost() + extraWeight * 10.0;
    }

    @Override
    public String getVehicleInfo() {
        // можно добавить спец поле
        return "Car{model='" + model + "', seats=" + numberOfSeats + ", baseCost=" + baseCost + ", " + engine.getEngineInfo() + "}";
    }
}