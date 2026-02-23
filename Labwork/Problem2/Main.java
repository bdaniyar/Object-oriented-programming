package Labwork.Problem2;

public class Main {
    public static void main(String[] args){
        // static NON-final: changing
        Order.globalDiscount = 0.10;
        
        // object

        Order o1 = new Order("Daniyar");
        o1.addItem(100); // Overloading 1
        o1.addItem(50,2); // Overloading 2
        System.out.println(o1);
        
        o1.pay();
        o1.addItem(10); // status != new

        Order o2 = new Order(); // customer = Unknown
        o2.addItem(20,3);
        System.out.println(o2);

        // read only
        System.out.println("o2 id = " + o2.getID());
        System.out.println("o2 customer = " + o2.getCustomer());
    }
}
