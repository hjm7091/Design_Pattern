package ex4;

public class Client {

	private static final int INIT_LOCATION[] = {50, 100, 150};
	
	public static void main(String[] args) {
		Ball[] balls = new Ball[3];
//		setStrategy(balls, new HorizonalMoveStrategy(), new RedDrawStrategy());
//		setStrategy(balls, new VerticalMoveStrategy(), new BlueDrawStrategy());
		setStrategy(balls, new DiagonalMoveStrategy(), new RedDrawStrategy());
		new BallFrame(balls);
	}
	
	public static void setStrategy(Ball[] balls, DirectionStrategy directionStrategy, DrawStrategy drawStrategy){
		for(int i=0; i<balls.length; i++) {
			balls[i] = new Ball(INIT_LOCATION[i], INIT_LOCATION[i]);
			balls[i].setDirectionStrategy(directionStrategy);
			balls[i].setDrawStrategy(drawStrategy);
			balls[i].start();
		}
	}

}
