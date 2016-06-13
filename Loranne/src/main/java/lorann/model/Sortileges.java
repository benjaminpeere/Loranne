package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Sortileges {
	int x,y;
	Image Sortileges;
	
	public Sortileges(int Startx, int Starty){
		x = Startx;
		y = Starty;
		
		ImageIcon iSortileges = new ImageIcon("Images/fireball_1.png");
		Sortileges = iSortileges.getImage();
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
		return Sortileges;
	}
}