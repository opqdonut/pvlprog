public class Account{
	private int balance;

	public Account() {
		balance = 0;
	}

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public boolean withdraw(int amount) {
		if (amount > balance) {
			return false;
		}

		balance -= amount;
		return true;
	}

	public void interest(double rate, double years) {
		balance = (int)(balance*Math.pow(1.0+rate, years));
	}
}
