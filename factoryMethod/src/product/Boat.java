package product;

public class Boat implements Transport {

	@Override
	public void recive() {
		System.out.println("recive product by sea");
	}

	@Override
	public void deliver() {
		System.out.println("delivering product by sea");
	}

	@Override
	public void checkout() {
		System.out.println("check product by sea");
	}

}
