package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Demon4 {
	int x,y;
	Image Demon4;
	
	public Demon4(int Startx, int Starty){
		x = Startx;
		y = Starty;
		
		ImageIcon iDemon4 = new ImageIcon("Images/monster_4.png");
		Demon4 = iDemon4.getImage();
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
		return Demon4;
	}
}
