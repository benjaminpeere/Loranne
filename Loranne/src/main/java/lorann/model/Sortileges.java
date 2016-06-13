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
		Rectangle Box = new Rectangle (x,y,34,34);
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

	public Image getImage(){
		if(SortilegeDir == "BAS"){
			Sortilege = iFireball1.getImage();
		}
		else if (MarioDir == "DROITE"){
			Mario = iMarioDroite.getImage();
		}
		else if (MarioDir == "GAUCHE"){
			Mario = iMarioGauche.getImage();
		}
		else if (MarioDir == "HAUT"){
			Mario = iMarioHaut.getImage();
		}
		return Mario;
	}

	public void Move(){
		for(int i = 0; i<33; i++){
			if(SortilegeDir == "BAS"){
				this.y += 34;
			}
			else if (SortilegeDir == "DROITE"){
				this.x += 34;
			}
			else if (SortilegeDir == "GAUCHE"){
				this.x -= 34;
			}
			else if (SortilegeDir == "HAUT"){
				this.y -= 34;
			}
		}
		
	}

}
