package tdd;

public class Account {
    private int balance;


    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public int getBalance() {
        return balance;

    }

    public void withdraw(int amount, String pin) {
        if ((pin.equals("1234")) && (amount > 0 && amount <= balance)) {
            balance = balance - amount;
        } else if ((amount < 0) && (pin.equals("1234"))) {
            System.out.println("Invalid Transaction");
        } else if (!pin.equals("1234")) {
            System.out.println("Wrong pin");
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}
