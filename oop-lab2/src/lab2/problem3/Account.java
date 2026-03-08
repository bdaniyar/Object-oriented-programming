package lab2.problem3;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int a){
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum){
        balance += sum;
    }

    public void withdraw(double sum){
        balance -= sum;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accNumber;
    }

    public void transfer(double amount, Account other){
        withdraw(amount);
        other.deposit(amount);
    }

    @Override
    public String toString(){
        return "Account #" + accNumber + " Balance: " + balance;
    }

    public final void print(){
        System.out.println(toString());
    }
}