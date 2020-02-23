package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width;
	private int height;
	
	int getx() {
		return this.x;
	}

	void setx(int x) {
		this.x = x;
	}

	int gety() {
		return this.y;
	}

	void sety(int y) {
		this.y = y;
	}
	

	int getwidth() {
		return this.width;
	}

	void setwidth(int width) {
		this.width = width;
	}
	

	int getheight() {
		return this.height;
	}

	void setheight(int height) {
		this.height = height;
	}

	Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width=width;
		this.height=height;
	}

		
	
	public void update() {

	}

	public abstract void draw(Graphics g);
}
