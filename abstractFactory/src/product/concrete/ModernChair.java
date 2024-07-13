package product.concrete;

import product.Chair;

public class ModernChair implements Chair {
	
	private boolean occupied;
	private Double batery;
	
	public ModernChair() {
		this.batery = 100.00;
	}	
	
	@Override
	public boolean isOccupied() {
		return occupied;
	}

	@Override
	public void sitOn() {
		this.occupied = true;
		
		while(batery > 0) {
			batery--;
		}

	}

	@Override
	public void getUp() {
		this.occupied = false;
		chargeChair();
		
	}
	
	public void chargeChair() {
		while(batery<100) {
			batery++;
		}
	}

	@Override
	public void type() {
		System.out.println("im modern");
		
	}

}
