package com.cg.Ex1;

public class SavingAccounts extends Account {
	final double minbalance = 500;

	void withdraw(Account accNum, double amount) {
		double currbal = accNum.getBalance();
		if (currbal > minbalance) {
			System.out.println("Withdraw can occur : ");
			double upbal = currbal - amount;
			accNum.setBalance(upbal);
		} else {
			System.out.println("Withdraw cannot occur : ");

		}
	}
}
