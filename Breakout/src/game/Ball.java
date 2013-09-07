package game;

public class Ball {
	double radius;
	double xpos;
	double ypos;
	int xvel;
	int yvel;
	
	Ball(double x, double y) {
		radius = 3;
		xpos = x;
		ypos = y;
		xvel = 0;
		yvel = 0;
	}
	
	public void returnToPaddle(Paddle player) {
		xvel = 0;
		yvel = 0;
		xpos = player.xpos;
		ypos = player.ypos;
	}
}
