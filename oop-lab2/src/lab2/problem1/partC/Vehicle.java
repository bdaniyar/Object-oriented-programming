package lab2.problem1.partC;
import java.util.Objects;

public class Vehicle {

    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    // setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString
    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year &&
                Objects.equals(brand, vehicle.brand);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(brand, year);
    }
}