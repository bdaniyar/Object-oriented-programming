package pr3.delivery.model;

public abstract class Vehicle {
    protected String model;
    protected double baseCost;
    protected Engine engine;

    public Vehicle(String model, double baseCost, Engine engine) {
        this.model = model;
        this.baseCost = baseCost;
        this.engine = engine;
    }

    // базовая реализация (можно простую)
    public double calculateDeliveryCost() {
        return baseCost;
    }

    // Важно: показываем композицию — выводим engine.getEngineInfo()
    public String getVehicleInfo() {
        return "Vehicle{model='" + model + "', baseCost=" + baseCost + ", " + engine.getEngineInfo() + "}";
    }
}