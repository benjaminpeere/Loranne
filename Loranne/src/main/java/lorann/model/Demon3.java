package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Demon3 {
	int x,y;
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
	
	public Image getImage(){
		return Demon3;
	}
}
