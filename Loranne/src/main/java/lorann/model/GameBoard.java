package lorann.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GameBoard extends JPanel implements KeyListener {

	String Game[][] = new String [12][12];
	int level = 1;
	private static ArrayList<Murs> Murss;
	private static ArrayList<Bulle> Bulles;
	private static ArrayList<Bourses> Boursess;
	Murs mur;
	Lorann lorann;
	Bulle bulle;
	Bourses bourses;
	Font levelFont = new Font("SansSerif", Font.BOLD, 30);
	FileReader fr;

	public GameBoard (){
		ChangerLevel();
		setFocusable(true);
		addKeyListener(this);
	}

	private void ChangerLevel() {
		try{
			fr = new FileReader("Maps/level1.level");
			int x=0, y=0, i=0;

			Murss = new ArrayList<Murs>();
			Bulles = new ArrayList<Bulle>();
			Boursess = new ArrayList<Bourses>();

			while((i=fr.read()) != -1){
				char strImg = (char) i;

				if(strImg == '0'){
					Game [x][y] = "MURS";
					mur = new Murs(x*32, y*32);
					Murss.add(mur);
				}
				else if (strImg == '1'){
					Game [x][y] = "LORANN";
					lorann = new Lorann (x*32, y*32);
				}
				else if (strImg == '2'){
					Game [x][y] = "BULLES";
					bulle = new Bulle (x*32, y*32);
					Bulles.add(bulle);
				}
				else if (strImg == '3'){
					Game [x][y] = "BOURSES";
					bourses = new Bourses (x*32, y*32);
					Boursess.add(bourses);
				}
				else if (strImg == ' '){
					Game[x][y] = null;
				}
				else if (strImg == '\r' || strImg == '\n'){
					x--;
				}
				if (x==11){
					y++;
					x=0;
				}
				else {
					x++;
				}		
			}
		}
		catch(Exception ex){
			repaint();
		}
	}

	public void paint (Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

		for(int i = 0; i< Murss.size(); i++){
			mur = (Murs) Murss.get(i); 
			g2d.drawImage(mur.getImage(), mur.getX(), mur.getY(), null);
		}
		for(int i = 0; i< Bulles.size(); i++){
			bulle = (Bulle) Bulles.get(i); 
			g2d.drawImage(bulle.getImage(), bulle.getX(), bulle.getY(), null);
		}
		for(int i = 0; i< Boursess.size(); i++){
			bourses = (Bourses) Boursess.get(i); 
			g2d.drawImage(bourses.getImage(), bourses.getX(),bourses.getY(), null);
		}
		try{
			g2d.drawImage(lorann.getImage(), lorann.getX(), lorann.getY(), null);
		}
		catch(Exception ex){
			g.setColor(Color.BLACK);
			g.setFont(levelFont);
			g.drawString("LEVEL : " + level,10, 25);
		}
	}
	public void keyPressed(KeyEvent arg0) {
		int Touche = arg0.getKeyCode();

		if (Touche == KeyEvent.VK_DOWN){
			lorann.setDir("BAS");
			lorann.Move();
			CheckCollision();
		}
		else if (Touche == KeyEvent.VK_UP){
			lorann.setDir("HAUT");
			lorann.Move();
			CheckCollision();
		}
		else if (Touche == KeyEvent.VK_RIGHT){
			lorann.setDir("DROITE");
			lorann.Move();
			CheckCollision();
		}
		else if (Touche == KeyEvent.VK_LEFT){
			lorann.setDir("GAUCHE");
			lorann.Move();
			CheckCollision();
		}
		else if (Touche == KeyEvent.VK_R){
			ChangerLevel();
		}
		repaint();
		//VerifierLevelFini();

	}
	public void CheckCollision(){
		Rectangle lorannRec;
		lorannRec = lorann.getBounds();

		for(int i=0;i<Murss.size();i++){
			mur = (Murs) Murss.get(i);
			Rectangle murRec = mur.getBounds();

			if(lorannRec.intersects(murRec)){
				if (lorann.getDir() == "BAS"){
					lorann.setY(lorann.getY() - 32 );
				}
				else if (lorann.getDir() == "HAUT"){
					lorann.setY(lorann.getY() + 32 );
				}
				else if (lorann.getDir() == "GAUCHE"){
					lorann.setX(lorann.getX() + 32 );
				}
				else if (lorann.getDir() == "DROITE"){
					lorann.setX(lorann.getX() - 32 );
				}
			}
		}

		

		for (int i=0;i<Bulles.size();i++){
			bulle = (Bulle) Bulles.get(i);
			Rectangle objectifRec = bulle.getBounds();

			for (int j = 0; j < Bulles.size(); j++){
				bulle = (Bulle) Bulles.get(i);
				

				if (lorannRec.intersects(objectifRec) &&  !bulle.getDessus()){
	
					bulle.setDessus(true);;
				}
				else if (!lorannRec.intersects(objectifRec) && bulle.getDessus()){
					
					bulle.setDessus(false);
				}
			}
		}

	}

	public void keyReleased(KeyEvent arg0) {


	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
