package Creator;

import product.Transport;
import product.Truck;

public class TruckCreator extends TransportCreator {

	@Override
	public Transport createTransport() {		
		return new Truck();
	}

}
