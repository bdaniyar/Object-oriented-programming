package pr3.delivery.model;

public class Truck extends Vehicle {
    private int maxLoad;

    public Truck(String model, double baseCost, Engine engine, int maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    @Override
    public double calculateDeliveryCost() {
        return baseCost + maxLoad * 2.0;
    }

    // overload
    public double calculateDeliveryCost(double distance, double fuelPrice) {
        return calculateDeliveryCost() + distance * fuelPrice;
    }

    @Override
    public String getVehicleInfo() {
        return "Truck{model='" + model + "', maxLoad=" + maxLoad + ", baseCost=" + baseCost + ", " + engine.getEngineInfo() + "}";
    }
}