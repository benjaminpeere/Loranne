package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Lorann {
	int x,y;
	String LorannDir = "BAS";
	Image Lorann;
	ImageIcon iLorannBas = new ImageIcon("Images/lorann_b.png");
	ImageIcon iLorannBasGauche = new ImageIcon("Images/lorann_bl.png");
	ImageIcon iLorannBasDroite = new ImageIcon("Images/lorann_br.png");
	ImageIcon iLorannDroite = new ImageIcon("Images/lorann_r.png");
	ImageIcon iLorannGauche = new ImageIcon("Images/lorann_l.png");
	ImageIcon iLorannHaut = new ImageIcon("Images/lorann_u.png");
	ImageIcon iLorannHautGauche = new ImageIcon("Images/lorann_ul.png");
	ImageIcon iLorannHautDroite = new ImageIcon("Images/lorann_ur.png");
	

	public Lorann(int Startx, int Starty){
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
		return LorannDir;
	}
	
	public void setX(int newX){
		this.x = newX;
	}
	
	public void setY(int newY){
		this.y = newY;
	}
	
	public void setDir(String newDir){
		this.LorannDir = newDir;
	}
	
	public Image getImage(){
		if(LorannDir == "BAS"){ //on fait ça pour donner la bonne image de lorann en fonction du déplacement
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
		if(LorannDir == "BAS"){ //on fait ça pour bouger dans le bon sens lorann
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
