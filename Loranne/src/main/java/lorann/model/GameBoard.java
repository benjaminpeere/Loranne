package lorann.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class GameBoard extends JPanel implements KeyListener {

	
	String Game[][] = new String [12][12];
	int level = 1;
	private static ArrayList<Murs> Murss;
	private static ArrayList<Bulle> Bulles;
	private static ArrayList<Bourses> Boursess;
	private static ArrayList<Demon1> Demons1;
	private static ArrayList<Demon2> Demons2;
	private static ArrayList<Demon3> Demons3;
	Murs mur;
	Lorann lorann;
	Bulle bulle;
	Bourses bourses;
	Demon1 demon1;
	Demon2 demon2;
	Demon3 demon3;
	Font levelFont = new Font("SansSerif", Font.BOLD, 30);
	FileReader fr;

	public GameBoard (){
		this.setBackground(Color.BLACK);
		
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
			Demons1 = new ArrayList<Demon1>();
			Demons2 = new ArrayList<Demon2>();
			Demons3 = new ArrayList<Demon3>();

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
				else if (strImg == '4'){
					Game [x][y] = "BOURSES";
					bourses = new Bourses (x*32, y*32);
					Boursess.add(bourses);
				}
				else if(strImg == '5'){
					Game[x][y] = "DEMON1";
					demon1 = new Demon1 (x*32,y*32);
					Demons1.add(demon1);
					
				}
				else if(strImg == '6'){
					Game[x][y] = "DEMON2";
					demon2 = new Demon2 (x*32,y*32);
					Demons2.add(demon2);
					
				}
				else if(strImg == '7'){
					Game[x][y] = "DEMON3";
					demon3 = new Demon3 (x*32,y*32);
					Demons3.add(demon3);
					
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
			g2d.drawImage(demon1.getImage(), demon1.getX(), demon1.getY(), null);
			g2d.drawImage(demon2.getImage(), demon2.getX(), demon2.getY(), null);
			g2d.drawImage(demon3.getImage(), demon3.getX(), demon3.getY(), null);
		}
		catch(Exception ex){
			g.setColor(Color.BLACK);
			g.setFont(levelFont);
			g.drawString("LEVEL : " + level,10, 25);
		}
		repaint();
	
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
		pathToLorann();
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

		for(int i=0;i<Boursess.size();i++){
			bourses = (Bourses) Boursess.get(i);
			Rectangle boursesRec = bourses.getBounds();

			if(lorannRec.intersects(boursesRec)){
				if (lorann.getDir() == "BAS"){
					Boursess.remove(i);
				}
				else if (lorann.getDir() == "HAUT"){
					Boursess.remove(i);
				}
				else if (lorann.getDir() == "GAUCHE"){
					Boursess.remove(i);
				}
				else if (lorann.getDir() == "DROITE"){
					Boursess.remove(i);
				}
			}
		}
		

		for (int i=0;i<Bulles.size();i++){
			bulle = (Bulle) Bulles.get(i);
			Rectangle objectifRec = bulle.getBounds();

			for (int j = 0; j < Bulles.size(); j++){
				bulle = (Bulle) Bulles.get(i);
				if (lorannRec.intersects(objectifRec)){		
					ChangerLevel();
				}
			}
		}
	}
	

	public void pathToLorann(){
		if(demon1.getX()<lorann.getX()){
			demon1.setX(1);
			demon1.MoveDemon();
		}
		else if(demon1.getX() > lorann.getX()){
			demon1.setX(-1);
			demon1.MoveDemon();
		}
		else if(demon1.getY() < lorann.getY()){
			demon1.setY(1);
			demon1.MoveDemon();
		}
		else if(demon1.getY() > lorann.getY()){
			demon1.setY(-1);
			demon1.MoveDemon();
		}
		repaint();
		
		
	}

	public void keyReleased(KeyEvent arg0) {
	

	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
