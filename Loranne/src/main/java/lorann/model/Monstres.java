package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Monstres {
	int x,y;
	String DemonDir = "BAS";
	Image Demon;
	ImageIcon iDemon1 = new ImageIcon("Images/monster_1.png");
	ImageIcon iDemon2 = new ImageIcon("Images/monster_2.png");
	ImageIcon iDemon3 = new ImageIcon("Images/monster_3.png");
	ImageIcon iDemon4 = new ImageIcon("Images/monster_4.png");
	
	

	public Monstres(int Startx, int Starty){
		x = Startx;
		y = Starty;
	}
	
	public Rectangle getBounds(){ //pour les collision
		Rectangle Box = new Rectangle(x,y,32,32);
		return Box;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String getDir(){
		return DemonDir;
	}
	
	public void setX(int newX){
		this.x = newX;
	}
	
	public void setY(int newY){
		this.y = newY;
	}
	
	public void setDir(String newDir){
		this.DemonDir = newDir;
	}
	
	public Image getImage(){
	
		if(LorannDir == "BAS"){ //on fait ça pour donner la bonne image de mario en fonction du déplacement
			Lorann = iLorannBas.getImage();
		}
		else if (LorannDir == "BASGAUCHE"){
			Lorann = iLorannBasGauche.getImage();
		}
		else if (LorannDir == "BASDROITE"){
			Lorann = iLorannBasDroite.getImage();
		}
		else if (LorannDir == "DROITE"){
			Lorann = iLorannDroite.getImage();
		}
		else if (LorannDir == "GAUCHE"){
			Lorann = iLorannGauche.getImage();
		}
		else if (LorannDir == "HAUT"){
			Lorann = iLorannHaut.getImage();
		}
		else if (LorannDir == "HAUTGAUCHE"){
			Lorann = iLorannHautGauche.getImage();
		}
		else if (LorannDir == "HAUTDROITE"){
			Lorann = iLorannHautDroite.getImage();
		}
		return Lorann;
	}
	
	public void Move(){
		if(LorannDir == "BAS"){ //on fait ça pour bouger dans le bon sens Mario
			this.y += 34;
		}
		else if (LorannDir == "BASGAUCHE"){
			this.y += 34;
			this.x -= 34;
		}
		else if (LorannDir == "BASDROITE"){
			this.y += 34;
			this.x += 34;
		}
		else if (LorannDir == "DROITE"){
			this.x += 34;
		}
		else if (LorannDir == "GAUCHE"){
			this.x -= 34;
		}
		else if (LorannDir == "HAUT"){
			this.y -= 34;
		}
		else if (LorannDir == "HAUTGAUCHE"){
			this.y -= 34;
			this.x -= 34;
		}
		else if (LorannDir == "HAUTDROITE"){
			this.y -= 34;
			this.x += 34;
		}
	}
}
