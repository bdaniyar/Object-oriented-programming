package lab2.problem3;

public class CheckingAccount extends Account {

    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int accNumber){
        super(accNumber);
        transactionCount = 0;
    }

    @Override
    public void deposit(double sum){
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum){
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee(){  
        if(transactionCount > FREE_TRANSACTIONS){
            int extra = transactionCount - FREE_TRANSACTIONS;
            double fee = extra * 0.02;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

    @Override
    public String toString(){

        return "CheckingAccount -> " + super.toString() +
                " Transactions: " + transactionCount;

    }
}