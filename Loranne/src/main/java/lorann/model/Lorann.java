package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Lorann extends Mobile{
	public static Object lorann;

	//String LorannDir = "BAS";
	Image Lorann;
	ImageIcon iLorannBas = new ImageIcon("Images/lorann_b.png");
	ImageIcon iLorannBasGauche = new ImageIcon("Images/lorann_bl.png");
	ImageIcon iLorannBasDroite = new ImageIcon("Images/lorann_br.png");
	ImageIcon iLorannDroite = new ImageIcon("Images/lorann_r.png");
	ImageIcon iLorannGauche = new ImageIcon("Images/lorann_l.png");
	ImageIcon iLorannHaut = new ImageIcon("Images/lorann_u.png");
	ImageIcon iLorannHautGauche = new ImageIcon("Images/lorann_ul.png");
	ImageIcon iLorannHautDroite = new ImageIcon("Images/lorann_ur.png");
	

	public Lorann(int Startx,int Starty){
		this.x = Startx;
		this.y = Starty;
		
		ImageIcon iLorann = new ImageIcon("Images/lorann_b.png");
		Lorann = iLorann.getImage();
	}
	
	public Rectangle getBounds(){ //pour les collision
		Rectangle Box = new Rectangle(x,y,32,32);
		return Box;
	}
	
	public Image getImage(){
		if(direction == "BAS"){ //on fait ça pour donner la bonne image de lorann en fonction du déplacement
			Lorann = iLorannBas.getImage();
		}
		else if (direction == "BASGAUCHE"){
			Lorann = iLorannBasGauche.getImage();
		}
		else if (direction == "BASDROITE"){
			Lorann = iLorannBasDroite.getImage();
		}
		else if (direction == "DROITE"){
			Lorann = iLorannDroite.getImage();
		}
		else if (direction == "GAUCHE"){
			Lorann = iLorannGauche.getImage();
		}
		else if (direction == "HAUT"){
			Lorann = iLorannHaut.getImage();
		}
		else if (direction == "HAUTGAUCHE"){
			Lorann = iLorannHautGauche.getImage();
		}
		else if (direction == "HAUTDROITE"){
			Lorann = iLorannHautDroite.getImage();
		}
		return Lorann;
	}
	
}
