interface Accountoperations{
    void deposit(double amount);
}

interface Loanoperations{
    void applyLoan(double amount);
}

class SmartAccount implements Accountoperations , Loanoperations{
    String AccountHolder;
    double balance;

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited Amount "+amount + " New Balance "+balance);
    }

    @Override 
    public void applyLoan(double amount){
        balance += amount;
        System.out.println("Loan Approved "+ amount+" For "+ AccountHolder + " New Balance "+balance);
    }
}


public class multiple_inheritance{
    public static void main(String[] args) {
        SmartAccount sa = new SmartAccount();
        sa.AccountHolder="Jayeh";
        sa.balance=5000.00;
        sa.deposit(1000.00);
        sa.applyLoan(2000.00);
    }
}