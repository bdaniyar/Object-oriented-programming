package Labwork.Problem3;

public class Main {
    public static void main(String[] args) {

        Temperature t1 = new Temperature(25);      // 25°C
        Temperature t2 = new Temperature(77, 'F'); // 77°F

        System.out.println("t1 in C = " + t1.getCelsius());
        System.out.println("t1 in F = " + t1.getFahrenheit());

        System.out.println("t2 in C = " + t2.getCelsius());
        System.out.println("t2 in F = " + t2.getFahrenheit());

        // меняем значение
        t1.setBoth(100, 'F');
        System.out.println("t1 now in C = " + t1.getCelsius());
    }
}