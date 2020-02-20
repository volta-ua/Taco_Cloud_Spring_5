
public class Regulator {
	
	private boolean isOne;
	
	Regulator(boolean isOne){
		this.isOne=isOne;
	}

	public synchronized boolean isOne() {
		return isOne;
	}

	public synchronized void setOne(boolean isOne) {
		this.isOne = isOne;
	}
	
	

}
