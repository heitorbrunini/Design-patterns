package product;

public class VictorianChair implements Chair {

	public boolean occupied;
	
	public VictorianChair() {
		 
	}
	
	@Override
	public boolean isOccupied() {
		return occupied;
	}

	@Override
	public void sitOn() {
		this.occupied = true;

	}

	@Override
	public void getUp() {
		this.occupied = false;
		
	}

}
