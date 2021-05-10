package com.cg.Ex3;

public class CD extends MediaItem {
	private String artist;
	private String genrecd;

	public CD(int uniqidnum, String title, int numcopies, String artist, String genrecd) {
		super(uniqidnum, title, numcopies);
		this.artist = artist;
		this.genrecd = genrecd;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenrecd() {
		return genrecd;
	}

	public void setGenrecd(String genrecd) {
		this.genrecd = genrecd;
	}

	public CD(int uniqidnum, String title, int numcopies) {
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
