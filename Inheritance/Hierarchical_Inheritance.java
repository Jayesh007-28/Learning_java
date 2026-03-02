class Account{
    String AcHolderName;
    double balance;

    void deposit(double amt){
        System.out.println("Account holder Name : "+AcHolderName);
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

class currentAc extends Account{
    double overdraftlimit;

    // void displyLimit(){
    //     System.out.println("Display limit : "+overdraftlimit);
    // }

    void withdraw(double amount){
        if(balance + overdraftlimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn "+amount +". Remaining Balance : "+balance);
        }else{
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Savingaccount ac = new Savingaccount();
        currentAc ac1 = new currentAc();
        ac.AcHolderName="Jayesh_jadhav";
        ac.balance=1000.0;
        ac.intrate=5;
        ac1.overdraftlimit=1000;

        ac.deposit(5000.0);
        ac.applyinterestRate();

        ac1.deposit(1000);
        ac1.withdraw(3500.0);
    }
}
