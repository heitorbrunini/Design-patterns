package application;

import Creator.BoatCreator;
import Creator.TransportCreator;
import Creator.TruckCreator;

public class Main {

	public static void main(String[] args) {
		
		TransportCreator creator = new BoatCreator();
		
		creator.createTransport();
		creator.send();
		
		System.out.println("");
		
		creator = new TruckCreator();
		
		creator.createTransport();
		creator.send();

	}

}
