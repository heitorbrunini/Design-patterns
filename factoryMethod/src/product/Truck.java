package product;

public class Truck implements Transport {

	@Override
	public void recive() {
		System.out.println("recive product by road");
	}

	@Override
	public void deliver() {
		System.out.println("delivering product by road");
	}

	@Override
	public void checkout() {
		System.out.println("check product by road");
	}

}
