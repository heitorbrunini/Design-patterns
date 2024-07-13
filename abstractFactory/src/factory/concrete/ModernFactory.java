package factory.concrete;

import factory.FurnitureFactory;
import product.Chair;
import product.CoffeTable;
import product.concrete.ModernChair;
import product.concrete.ModernCoffeTable;

public class ModernFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		
		return new ModernChair();
	}

	@Override
	public CoffeTable createCoffeTable() {
		
		return new ModernCoffeTable();
	}

}
