
public class BankAccount {
	private int pin;
	private long accountNo;
	private double balance;
	private User accountHolder;
	
	public BankAccount(int pin, long accountNo, double balance, User accountHolder) {
		this.pin = pin;
		this.accountNo = accountNo;
		this.balance = balance;
		this.accountHolder = accountHolder;
	}
	
	public int getPin() {
		return pin;
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public User getAccountHolder() {
		return accountHolder;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}
