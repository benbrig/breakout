package game;

public class Brick {
	double xpos;
	double ypos;
	boolean isAlive;
	int width;
	int height;
	
	Brick() {
		isAlive = true;
		width = 50;
		height = 20;
	}
	
	public void kill() {
		xpos = 0;
		ypos = -5000;
	}
}
