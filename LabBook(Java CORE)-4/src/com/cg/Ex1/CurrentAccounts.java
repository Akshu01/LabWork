package com.cg.Ex1;

public class CurrentAccounts extends Account {
	double overdraftlimit;

	void withdraw(Account accNum, double amount) {
		double currbal = accNum.getBalance();
		if (amount > overdraftlimit) {
			System.out.println("Withdraw amount is greater than allowed : ");
			System.out.println("Withdrawl is not possible : ");

		} else {
			System.out.println("Withdraw  occur : ");
			double upbal = currbal - amount;
			accNum.setBalance(upbal);

		}
	}
}
