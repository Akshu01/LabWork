package com.cg.Ex3;

abstract class Item {
	private int uniqidnum;
	private String title;
	private int numcopies;

	public Item(int uniqidnum, String title, int numcopies) {
		super();
		this.uniqidnum = uniqidnum;
		this.title = title;
		this.numcopies = numcopies;
	}

	public int getUniqidnum() {
		return uniqidnum;
	}

	public void setUniqidnum(int uniqidnum) {
		this.uniqidnum = uniqidnum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumcopies() {
		return numcopies;
	}

	public void setNumcopies(int numcopies) {
		this.numcopies = numcopies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numcopies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + uniqidnum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (numcopies != other.numcopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (uniqidnum != other.uniqidnum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [uniqidnum=" + uniqidnum + ", title=" + title + ", numcopies=" + numcopies + "]";
	}

	abstract void additem();

	abstract void checkIn();

	abstract void checkOut();

	abstract void print();
}
