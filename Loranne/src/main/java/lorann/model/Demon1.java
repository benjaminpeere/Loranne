package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Demon1 {


	int x,y;
	Image Demon1;
	String Demon1Dir = "BAS";
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
	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}
	public String getDir(){
		return Demon1Dir;
	}
	public void setDir(String newDir){
		this.Demon1Dir = newDir;
	}
	public Image getImage(){
		return Demon1;
	}
	public void MoveDemon(){
		if(Demon1Dir == "BAS"){ //on fait ça pour bouger dans le bon sens lorann
			this.y += 32;
		}
		else if (Demon1Dir == "BASGAUCHE"){
			this.y += 32;
			this.x -= 32;
		}
		else if (Demon1Dir == "BASDROITE"){
			this.y += 32;
			this.x += 32;
		}
		else if (Demon1Dir == "DROITE"){
			this.x += 32;
		}
		else if (Demon1Dir == "GAUCHE"){
			this.x -= 32;
		}
		else if (Demon1Dir == "HAUT"){
			this.y -= 32;
		}
		else if (Demon1Dir == "HAUTGAUCHE"){
			this.y -= 32;
			this.x -= 32;
		}
		else if (Demon1Dir == "HAUTDROITE"){
			this.y -= 32;
			this.x += 32;
		}
	}
}
