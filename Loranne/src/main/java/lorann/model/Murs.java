package lorann.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Murs {

	int x,y;
	Image Bone;
	String BoneDir = "VERTICAL";
	ImageIcon iMur = new ImageIcon("Images/bone.png");
	ImageIcon iMurHorizon = new ImageIcon("Images/horizontal_bone.png");
	ImageIcon iMurVerti = new ImageIcon("Images/vertical_bone.png");


	public Murs(int Startx, int Starty){
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

	public String getDir(){
		return BoneDir;
	}

	public Image getImage(){
		if(BoneDir == "VERTICAL"){
			Bone = iMur.getImage();
		}
		else if (BoneDir == "HORIZONTAL"){
			Bone = iMurHorizon.getImage();
		}
		else if (BoneDir == "DROIT"){
			Bone = iMur.getImage();
		}
		
		return Bone;
	}

}


