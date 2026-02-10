package Labwork.Problem2;

public class Order {
    private static int nextId = 1;
    public static double globalDiscount = 0.0;

    // static final
    public static final int MAX_ITEMS = 10;
    public static final double TAX = 0.12;

    // read-only fields (final)
    private final int id;
    private final String customer;

    private OrderStatus status;
    private int items;
    private double sum;

    {
        status = OrderStatus.NEW;
        items = 0;
        sum = 0.0;
    }

    public Order(){
        this("Unknown");
    }

    public Order(String customer){
        this.id = nextId++;
        this.customer = customer.trim();
    }
    // getters
    public int getID(){
        return id;
    }
    public String getCustomer(){
        return customer;
    }
    public OrderStatus getStatus(){
        return status;
    }

    // Overloading 
    public void addItem(double price){
        addItem(price,1);
    }

    public void addItem(double price, int qty){
        if(status != OrderStatus.NEW){
            System.out.println("Cannot add items: order is not NEW.");
            return;
        }
        if(price < 0 || qty <= 0){
            System.out.println("Invalid item values.");
            return;
        }
        if(items + qty > MAX_ITEMS){
            System.out.println("Too many items. Max = " + MAX_ITEMS);
            return;
        }

        items+=qty;
        sum += price * qty;
    }

    public double total(){
        double discounted = sum * (1.0 - globalDiscount);
        return discounted * (1.0 + TAX);
    }

    public void pay(){
        if(status == OrderStatus.NEW){
            status = OrderStatus.PAID;
        }
    }

    @Override
    public String toString() {
        return "Order #" + id +
               " | customer=" + customer +
               " | status=" + status +
               " | items=" + items +
               " | total=" + total();
    }
}
