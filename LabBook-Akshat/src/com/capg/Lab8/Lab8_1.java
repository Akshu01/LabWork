package com.capg.Lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab8_1 {
	FileInputStream fi = null;
	FileOutputStream fo = null;

	public Lab8_1(FileInputStream fi, FileOutputStream fo) {
		super();
		this.fi = fi;
		this.fo = fo;
	}

	public void start() {
		int a = 0;
		int count = 0;
		try {
			while ((a = fi.read()) != -1) {
				char c = (char) a;
				fo.write((byte) c);
				fo.flush();
				count++;
				if (count == 10) {
					System.out.println("10 characters are copied");
					count = 0;
					Thread.sleep(5000);
				}
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}

}