package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Bourses {
	int x,y;
	Image Bourses;
	
	public Bourses(int Startx, int Starty){
		x = Startx;
		y = Starty;
		
		ImageIcon iBourses = new ImageIcon("Images/purse.png");
		Bourses = iBourses.getImage();
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
		return Bourses;
	}

}
