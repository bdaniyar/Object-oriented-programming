package pr1;

public class Task5 {
    public static void main(String[] args){
        double balance = 1500.0;

        double rate = 5.0;

        double earned = balance * (rate/100);

        double newBalance = balance + earned;

        System.out.println("Initial Balance:  $" + balance);
        System.out.println("Interest Rate:    " + rate + "%");
        System.out.println("Interest Earned:  $" + earned);
        System.out.println("----------------------------");
        System.out.println("New Balance:      $" + newBalance);

    }
}
