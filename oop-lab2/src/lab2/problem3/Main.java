package lab2.problem3;

public class Main {

    public static void main(String[] args){

        Bank bank = new Bank();

        SavingsAccount s1 = new SavingsAccount(1001,5);
        CheckingAccount c1 = new CheckingAccount(2001);

        bank.openAccount(s1);
        bank.openAccount(c1);

        s1.deposit(1000);

        c1.deposit(500);
        c1.withdraw(100);
        c1.deposit(50);

        bank.update();

        bank.printAccounts();

    }
}