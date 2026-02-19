class Account{
    String AcHolderName;
    double balance;

    void deposit(double amt){
        balance += amt;
        System.out.println("Account Holder Name : "+AcHolderName);
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

class perimumsaving  extends Savingaccount{
    double bonusrate;

    void applyBonus(){
        double bonus = balance * bonusrate / 100;

        balance += bonus;
        System.out.println("Bomus credited : "+bonus+" new balance after creding bouns : "+balance);
    }
}

public class multi_level_inheritance {
    public static void main(String[] args) {
        perimumsaving ac = new perimumsaving();
        ac.AcHolderName="Jayesh_Jadhav";
        ac.balance=10000.0;
        ac.intrate=5;
        ac.bonusrate=3;

        ac.deposit(5000.0);
        ac.applyinterestRate();
        ac.applyBonus();
    }
}
