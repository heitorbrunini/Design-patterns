package Creator;

import product.Boat;
import product.Transport;

public class BoatCreator extends TransportCreator {

	@Override
	public Transport createTransport() {
		return new Boat();
	}

}
