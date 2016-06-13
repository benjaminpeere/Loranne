package lorann.model;

import java.awt.Color;

import javax.swing.JFrame;

import lorann.model.GameBoard;

public class ViewFrame  extends JFrame{

	public ViewFrame(){
		this.setTitle("Lorann");
		this.setSize(408, 408);//definie taille de la fenetre (ici on veux 12 images de 34 px)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new GameBoard());
		this.setVisible(true);
		JFrame.getContentPane().setBackground(Color.black);
	}


}


