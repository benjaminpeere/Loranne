package lorann.model;

public class Mobile implements IMobile{
	int x,y;
	String direction = "BAS";

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDir() {
		return direction;
	}

	public void setDir(String direction) {
		this.direction = direction;
	}

	public void move() {
		switch (this.direction) {
			case "HAUT":
				this.moveUp();
				break;
			case "DROITE":
				this.moveRight();
				break;
			case "BAS":
				this.moveDown();
				break;
			case "GAUCHE":
				this.moveLeft();
				break;
			default:
				break;
		}
	}
	
	void moveUp() {
		this.setY(getY() - 32 );;
	}

	void moveRight() {
		this.setX(getX() + 32);
	}

	void moveDown() {
		this.setY(getY() + 32 );
	}

	void moveLeft() {
		this.setX(getX() - 32 );
	}
}
