package com.cg.Ex3;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int yearreleased;

	public Video(int uniqidnum, String title, int numcopies, String director, String genre, int yearreleased) {
		super(uniqidnum, title, numcopies);
		this.director = director;
		this.genre = genre;
		this.yearreleased = yearreleased;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearreleased() {
		return yearreleased;
	}

	public void setYearreleased(int yearreleased) {
		this.yearreleased = yearreleased;
	}

	public Video(int uniqidnum, String title, int numcopies) {
		super(uniqidnum, title, numcopies);
		// TODO Auto-generated constructor stub
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
