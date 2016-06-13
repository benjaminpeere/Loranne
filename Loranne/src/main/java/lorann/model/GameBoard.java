package lorann.model;

import java.awt.Font;
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
			fr = new FileReader("Maps/"+ level + ".level");
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
	
	
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
