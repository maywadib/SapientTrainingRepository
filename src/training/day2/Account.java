package training.day2;

import java.io.Serializable;

public class Account implements Serializable {
	private int accountId;
	private String customerName;
	private double initialBalance;
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerName=" + customerName + ", initialBalance="
				+ initialBalance + "]";
	}

	private static int count = 100;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountId() {
		return accountId;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public int getCount() {
		return count;
	}

	public Account(String customerName, double initialBalance) {
		this.customerName = customerName;
		this.initialBalance = initialBalance;
		
		this.accountId = count++;
	}
}
