import dictionary.Direction;
import dictionary.PlayerType;

public class Player {
	
	private PlayerType type;
	private int answerQty=0;	

	Player(PlayerType type){
		this.type=type;		
	}
	
	public PlayerType getType() {
		return type;
	}

	public void setType(PlayerType type) {
		this.type = type;
	}
	
	public int getAnswerQty() {
		return answerQty;
	}

	public void setAnswerQty(int answerQty) {
		this.answerQty = answerQty;
	}
	
	public void beat(Ball ball) {
		if (isValid(ball)) {
			//ball.setDirection(ball.getDirection().getOpposite());
			answerQty++;
			System.out.println("new beat form "+type+" for " + answerQty + " time to "+ball.getDirection());		
		}else {
			throw new RuntimeException("answer error by " + type);
		}
	}

	private boolean isValid(Ball ball) {
		if (ball==null || this==null) {
			return false;
		}
		
		if ((ball.getDirection()==Direction.LEFTtoRIGHT && this.getType()==PlayerType.R)||
				(ball.getDirection()==Direction.RIGHTtoLEFT && this.getType()==PlayerType.L)) {
			return true;
		}
			
		return false;
	}
	
	private Direction newDirection() {
		Direction result=null;
		if (type==type.L) {
			result=Direction.LEFTtoRIGHT;
		}else if(type==type.R){
			result=Direction.RIGHTtoLEFT;
		}else {
			new RuntimeException("newDirection error");
		}
		return result;
	}

}
