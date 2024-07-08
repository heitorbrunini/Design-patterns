package Creator;

import product.Transport;

public abstract class TransportCreator {
	
	public abstract Transport createTransport();
	
	public void send() {
		Transport transport = createTransport();
		transport.recive();
		transport.checkout();
		transport.deliver();
	}

}
