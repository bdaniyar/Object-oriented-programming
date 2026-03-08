package lab2.problem3;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int accNumber, double rate){
        super(accNumber);
        this.interestRate = rate;
    }

    public void addInterest(){

        double interest = getBalance() * interestRate / 100;

        deposit(interest);

    }

    @Override
    public String toString(){

        return "SavingsAccount -> " + super.toString() +
                " Interest: " + interestRate + "%";

    }
}