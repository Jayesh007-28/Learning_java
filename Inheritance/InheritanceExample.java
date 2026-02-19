class Account{
    String AcHolderName;
    double balance;

    void deposit(double amt){
        balance += amt;
        System.out.println("Deposit amount : "+amt+" new balance : "+balance);
    }
}

class Savingaccount extends Account{
    double intrate;

    void applyinterestRate(){
        double interest = balance * intrate / 100;

        balance += interest;

        System.out.println("Interest applied : "+interest+" current balance : "+balance);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Savingaccount ac = new Savingaccount();
        ac.AcHolderName="Jayesh";
        ac.balance=10000.0;
        ac.intrate=5;

        ac.deposit(5000.0);
        ac.applyinterestRate();
    }
}
