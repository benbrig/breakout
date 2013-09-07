package game;

public class Breakout {
	
	
	public static void brickX(Brick[] arr) {
		arr[1].xpos = 0;
	}
	
	public static void brickY(Brick[] arr) {
		arr[1].ypos = 20;
	}
	public static void main(String[] args) {
		//Initialize board
		StdDraw.setXscale(-150, 150);
		StdDraw.setYscale(-10, 200);
		
		//Initialize paddle
		Paddle player = new Paddle(0, 0);
		
		//Initialize ball
		Ball ball = new Ball(0, player.xpos + (.5 * player.height) + 3);
		
		//Initialize bricks
		Brick[] array = new Brick[18];
		for(int i = 0; i < 18; i++) {
			array[i] = new Brick();
		}
		
		//Assign values to bricks
		brickX(array);
		brickY(array);
		
		while(player.lives > 0) {
			StdDraw.show(1000 / 120);
			StdDraw.clear();
			
			//Draw info
			StdDraw.text(0, 200, "Breakout");
			StdDraw.text(-140, 200, "Lives: " + player.lives);
			
			//Draw paddle
			StdDraw.filledRectangle(player.xpos, player.ypos, .5 * player.width, .5 * player.height);
			
			//Draw ball
			StdDraw.filledCircle(ball.xpos, ball.ypos, ball.radius);
			
			//Draw bricks
			for(int i = 0; i < 18; i++) {
				StdDraw.filledRectangle(array[i].xpos, array[i].ypos, .5 * array[i].width, .5 * array[i].height);
			}
		}
	}

}
