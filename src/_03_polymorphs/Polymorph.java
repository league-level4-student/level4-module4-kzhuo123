package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;

	int x() {
		return this.x;
	}

	void setx(int x) {
		this.x = x;
	}

	int y() {
		return this.y;
	}

	void sety(int y) {
		this.y = y;
	}

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);
}
