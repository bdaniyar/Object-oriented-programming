public class Task5 {
    public static void main(String[] args){
        double balance = 1500.0;

        double Rate = 5.0;

        double Earned = balance * (Rate/100);

        double newBalance = balance + Earned;

        System.out.println("Initial Balance:  $" + balance);
        System.out.println("Interest Rate:    " + Rate + "%");
        System.out.println("Interest Earned:  $" + Earned);
        System.out.println("----------------------------");
        System.out.println("New Balance:      $" + newBalance);

    }
}
