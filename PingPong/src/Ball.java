import dictionary.Direction;

public class Ball {
	
	private Direction direction;
	
	Ball(){
		direction=Direction.RIGHTtoLEFT;
		System.out.println("Ball is created");
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public void update() {
		this.setDirection(this.getDirection().getOpposite());
	}

}
