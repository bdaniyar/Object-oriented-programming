package problem2;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Student student = new Student();
        Restaurant restaurant = new Restaurant();

        restaurant.servePizza(cat);
        System.out.println("-----");
        restaurant.servePizza(student);
    }
}
