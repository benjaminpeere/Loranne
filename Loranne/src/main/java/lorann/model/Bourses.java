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
		
		ImageIcon iBourses = new ImageIcon("Images/purse.jpg");
		Bourses = iBourses.getImage();
	}
	

	public Rectangle getBounds(){ //pour les collision
		Rectangle Box = new Rectangle(x,y,34,34);
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
