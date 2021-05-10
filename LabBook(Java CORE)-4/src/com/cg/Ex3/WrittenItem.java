package com.cg.Ex3;

abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int uniqidnum, String title, int numcopies, String author) {
		super(uniqidnum, title, numcopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
