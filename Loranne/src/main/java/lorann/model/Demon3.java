package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Demon3 extends Mobile{

	Image Demon3;
	public Demon3(int Startx, int Starty){
		x = Startx;
		y = Starty;
		
		ImageIcon iDemon3 = new ImageIcon("Images/monster_3.png");
		Demon3 = iDemon3.getImage();
		
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
		return Demon3;
	}
	
}
