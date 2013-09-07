package game;

public class Paddle {
	String name;
	double xpos;
	double ypos;
	double width;
	double height;
	int vel;
	int lives;
	
	Paddle(double x, double y) {
		xpos = x;
		ypos = y;
		vel = 0;
		width = 30;
		height = 5;
		lives = 3;
	}
}
