package Day4;

class BankAccount {
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount) {
        balance = balance - amount;
    }
}
class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Transaction Denied: Balance shorld not below $100");
        } else {
            super.withdraw(amount);
            System.out.println("Transaction successful: Balance :" + balance);
        }
    }
}
public class bank_program {

	public static void main(String[] args) {
	 SavingsAccount s = new SavingsAccount(1500);
	 s.withdraw(1420);
	 s.withdraw(200);
	}

}
