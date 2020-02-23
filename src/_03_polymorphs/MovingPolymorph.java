package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph {

	MovingPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
		setx(getx() + 1);
		sety(gety() + 1);
		if (getx() >= 450) {
			setx(getx() - 2);
		}
		if (getx() <= 50) {
			setx(getx() + 2);
		}
		if (gety() >= 450) {
			sety(gety() - 2);
		}
		if (gety() <= 50) {
			sety(gety() + 2);
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getx(), gety(), getwidth(), getheight());

	}

}
