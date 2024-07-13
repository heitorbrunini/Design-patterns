package product.concrete;

import java.util.ArrayList;
import java.util.List;

import product.CoffeTable;

public class VictorianCoffeTable implements CoffeTable {

	private List<String> items = new ArrayList<>();
	
	@Override
	public boolean isFull() {
		return items.size() > 7;
	}

	@Override
	public void useTable(String item) {
		if(!isFull()) {
			items.add(item);
		}
		
	}

	@Override
	public void removeItem() {
		
		items.removeFirst();
		
	}

	@Override
	public void seeItems() {
		System.out.println(items.toString());
		
	}

}
