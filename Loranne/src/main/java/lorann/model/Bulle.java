package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Bulle {
	int x,y;
	Image Bulle;
	boolean lorannDessus = false;
	
	public Bulle(int Startx, int Starty ){
		x = Startx;
		y = Starty;
		
		ImageIcon iBulle = new ImageIcon("Images/crystal_ball.png");
		Bulle = iBulle.getImage();
	}
	
	public Rectangle getBounds(){
		Rectangle Box = new Rectangle(x,y,34,34);
		return Box;
	}
	
	public boolean getDessus(){
		return lorannDessus;
	}
	
	public void setDessus(boolean newDessus){
		this.lorannDessus = newDessus;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Image getImage(){
		return Bulle;
	}
}
