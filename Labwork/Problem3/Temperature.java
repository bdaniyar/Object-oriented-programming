package Labwork.Problem3;

public class Temperature {

    private double value;
    private char scale; // 'C' or 'F'

    // 1) default constructor → 0°C
    public Temperature() {
        value = 0.0;
        scale = 'C';
    }

    // 2) only value → assume Celsius
    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    // 3) only scale → value = 0
    public Temperature(char scale) {
        this.value = 0.0;
        this.scale = Character.toUpperCase(scale);
    }

    // 4) value + scale
    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = Character.toUpperCase(scale);
    }

    // get in Celsius
    public double getCelsius() {
        if (scale == 'C') return value;
        return 5 * (value - 32) / 9;
    }

    // get in Fahrenheit
    public double getFahrenheit() {
        if (scale == 'F') return value;
        return 9 * value / 5 + 32;
    }

    // setters
    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = Character.toUpperCase(scale);
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = Character.toUpperCase(scale);
    }

    // get scale
    public char getScale() {
        return scale;
    }
}