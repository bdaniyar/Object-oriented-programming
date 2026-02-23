import pr3.animal.model.Animal;
import pr3.animal.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Animal a1 = new Dog("Rex", 3, "German Shepherd");

        Dog d1 = new Dog("Buddy", 2, "Labrador");
        Dog d2 = new Dog("Max", 5, "Husky");

        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(d1);
        animals.add(d2);

        for (Animal a : animals) {
            System.out.println("-----");
            a.getInfo();
            a.makeSound();

            a.eat();               
            a.eat("meat");         
        }
    }
}