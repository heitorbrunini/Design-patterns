package application;

import factory.FurnitureFactory;
import factory.concrete.ModernFactory;
import factory.concrete.VictorianFactory;
import product.Chair;
import product.CoffeTable;

public class Main {

	public static void main(String[] args) {
		
		FurnitureFactory vFactory = new VictorianFactory();
		FurnitureFactory mFactory = new ModernFactory();		
		
		Chair chair = vFactory.createChair();
		
		chair.type();
		
		chair = mFactory.createChair();
		
		chair.type();
		
		CoffeTable coffeTable =  vFactory.createCoffeTable();
		
		coffeTable = mFactory.createCoffeTable();
		
		
	}

}
