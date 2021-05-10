package com.cg.Ex3;

public class JournalPaper extends WrittenItem {
	private int year;

	public JournalPaper(int uniqidnum, String title, int numcopies, String author, int year) {
		super(uniqidnum, title, numcopies, author);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	void additem() {
		// TODO Auto-generated method stub

	}

	@Override
	void checkIn() {
		// TODO Auto-generated method stub

	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub

	}

	@Override
	void print() {
		// TODO Auto-generated method stub

	}

}
