package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Demon1 {
	int x,y;
	Image Demon1;
	
	public Demon1(int Startx, int Starty){
		x = Startx;
		y = Starty;
		
		ImageIcon iDemon1 = new ImageIcon("Images/monster_1.png");
		Demon1 = iDemon1.getImage();
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
	
	public Image getImage(){
		return Demon1;
	}
}
