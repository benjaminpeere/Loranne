package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Demon2 extends Mobile{

	Image Demon2;
	public Demon2(int Startx, int Starty){
		x = Startx;
		y = Starty;
		
		ImageIcon iDemon2 = new ImageIcon("Images/monster_2.png");
		Demon2 = iDemon2.getImage();
	}

	public Rectangle getBounds(){ //pour les collisions
		Rectangle Box = new Rectangle(x,y,32,32);
		return Box;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Image getImage(){
		return Demon2;
	}
}
