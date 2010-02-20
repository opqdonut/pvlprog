/* http://blogs.humanisti.fixme.fi/ohpe/?p=113 */

public class LimitAccount extends Account {
	
	private int limit;

	public LimitAccount(int limit, int balance) {
		super(balance);
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public boolean withdraw(int amount) {
		if (amount <= limit) {
			return super.withdraw(amount);
		}
		return false;
	}

}
