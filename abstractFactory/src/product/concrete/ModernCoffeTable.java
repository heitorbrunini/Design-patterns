package product.concrete;

import java.util.ArrayList;
import java.util.List;

import product.CoffeTable;

public class ModernCoffeTable implements CoffeTable {

	private List<String> items = new ArrayList<>();
	private Double batery = 100.00;
	
	@Override
	public boolean isFull() {
		
		return items.size() > 5;
	}

	@Override
	public void useTable(String item) {
		
		if(!isFull() && batery > 0) {
			items.add(item);
			System.out.println("Lights up");
			batery-=10;
		}else{
			System.out.println("not possible, low Batery or table Full");
		}
		
	}

	@Override
	public void removeItem() {
		
		items.removeFirst();
		
	}
	
	public void chargeBatery() {
		batery +=100; 
	}

	@Override
	public void seeItems() {
		
		System.out.println(items.toString());
		
	}
	
	

}
