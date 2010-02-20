/* http://blogs.humanisti.fixme.fi/ohpe/?p=89 */

public class AccountTester {
	public static void main(String[] args) {
		Account account1 = new Account(400);

		if (account1.getBalance() == 400) {
			System.out.println("getBalance() ok");
		} else {
			System.err.println("Account(int balance) tai getBalance() tai Account(int balance) EI ok");
		}

		Account account2 = new Account();
		account2.deposit(100);

		if (account2.getBalance() == 100) {
			System.out.println("deposit(int amount) ok");
		} else {
			System.err.println("Account() tai getBalance() tai deposit(int amount) EI ok");
		}

		Account account3 = new Account(200);
		boolean withdraw3success = account3.withdraw(300);

		if (withdraw3success == false && account3.getBalance() == 200) {
			System.out.println("withdraw(int amount) ok");
		} else {
			System.err.println("Account(int balance) tai getBalance() tai withdraw(int amount) EI ok");
		}

		Account account4 = new Account(1000);
		account4.interest(0.005, 2.5);

		if (account4.getBalance() > 1000) {
			System.out.println("interest(double rate, double years) ok");
		} else {
			System.err.println("Account(int balance) tai getBalance() tai interest(double rate, double years) EI ok");
		}
	}
}
