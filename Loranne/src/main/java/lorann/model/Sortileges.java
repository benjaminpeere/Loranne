package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Sortileges  {
	int x,y;
	String SortilegeDir = "BAS";
	Image Sortilege;
	ImageIcon iFireball1 = new ImageIcon ("Image/fireball_1.png");
	ImageIcon iFireball2 = new ImageIcon ("Image/fireball_2.png");
	ImageIcon iFireball3 = new ImageIcon ("Image/fireball_3.png");
	ImageIcon iFireball4 = new ImageIcon ("Image/fireball_4.png");
	ImageIcon iFireball5 = new ImageIcon ("Image/fireball_5.png");

	public Sortileges(int Startx, int Starty){
		x = Startx;
		y = Starty;	
	}

	public Rectangle getBounds(){
		Rectangle Box = new Rectangle (x,y,32,32);
		return Box;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String getDir() {
		return SortilegeDir;
	}

	public void setX(int newX) {
		this.x = newX;
	}
	public void setY(int newY) {
		this.y = newY;
	}
	public void setDir(String newDir) {
		this.SortilegeDir = newDir;
	}
}
