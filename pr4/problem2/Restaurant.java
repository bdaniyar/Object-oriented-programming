package problem2;
public class Restaurant{

    boolean servePizza(CanHavePizza eater){
        eater.eatPizza();

        if(eater instanceof Person){
            System.out.println("Processing payment");
        }

        return true;
    }
}