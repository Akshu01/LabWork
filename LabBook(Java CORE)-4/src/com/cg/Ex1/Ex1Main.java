package com.cg.Ex1;

public class Ex1Main {

	public static void main(String[] args) {
		int i = 100;
		double amount = 2000;
		double wamount = 2000;
		Bank b = new Bank();

		Person p = new Person();
		p.setAge(25);
		p.setName("Smith");
		Account a = new Account();
		a.setAccHolder(p);
		a.setAccNum(i);
		a.setBalance(2000);

		Person p1 = new Person();
		p1.setAge(24);
		p1.setName("Kathy");
		Account a1 = new Account();
		a1.setAccHolder(p);
		a1.setAccNum(i++);
		a1.setBalance(3000);

		b.deposit(a, amount);
		System.out.println("After deposit balance :" + a.getBalance());
		System.out.println();

		b.withdraw(a1, wamount);
		System.out.println("After withdraw balance :" + a1.getBalance());

	}

}
