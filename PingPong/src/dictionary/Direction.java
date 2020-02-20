package dictionary;

public enum Direction{	
	LEFTtoRIGHT,
	RIGHTtoLEFT;
	
	public Direction getOpposite() {
		if (this!=LEFTtoRIGHT && this!=RIGHTtoLEFT) {
			return null;
		}		
		return  this==LEFTtoRIGHT?RIGHTtoLEFT:LEFTtoRIGHT;
	}
}