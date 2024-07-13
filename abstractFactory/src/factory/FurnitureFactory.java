package factory;

import product.Chair;
import product.CoffeTable;

public interface FurnitureFactory {

	public Chair createChair();
	
	public CoffeTable createCoffeTable();
	
}
