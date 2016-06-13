package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Porte_sortie {

	int x,y;
	String Etat = "FERME";
	Image Porte;
	ImageIcon iGateClosed = new ImageIcon("Images/gate_closed.png");
	ImageIcon iGateOpen = new ImageIcon ("Image/gate_open.png");
	boolean porteouverte = false;

	public Porte_sortie (int Startx, int Starty){
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
	

	public boolean getJuste(){
		return porteouverte;
	}

	public void setJuste(boolean newJuste){
		this.porteouverte = newJuste;
	}

	public void setEtat (String newEtat){
		this.Etat = newEtat;
	}
	public Image getImage(){
		if (Etat == "FERME"){
			Porte = iGateClosed.getImage();
		}
		else if(Etat == "OUVERT"){
			Porte = iGateOpen.getImage();
		}
		return Porte;
	}
}
