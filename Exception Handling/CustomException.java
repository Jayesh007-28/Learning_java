class InsufficientBalance extends Exception {
    InsufficientBalance(String message){
        super(message);
    }
}

class BankAccount{
    int balance = 5000;

    void withdraw (int amount) throws InsufficientBalance {
        if(amount > balance) {
            throw new InsufficientBalance("Insufficient Balance.....");
        }

        balance = balance - amount;
        System.out.println("Balance : "+balance);
    }
}


public class CustomException {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();

        try {
            obj.withdraw(7000);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
    }
}
