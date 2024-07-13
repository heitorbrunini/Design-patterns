package product.concrete;

import product.Chair;

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

	@Override
	public void type() {
		System.out.println("im victorian");		
	}

}
