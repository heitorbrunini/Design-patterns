package factory.concrete;

import factory.FurnitureFactory;
import product.Chair;
import product.CoffeTable;
import product.concrete.VictorianChair;
import product.concrete.VictorianCoffeTable;

public class VictorianFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public CoffeTable createCoffeTable() {
		return new VictorianCoffeTable();
	}

}
