package application;

public class Main {

	public static void main(String[] args) {

		Database data1 = Database.getInstance();

		Database data2 = Database.getInstance();

		//data 1 has the same value from data 2 if do not sum any value, because is the same instance
		data1.sumMethod(2);
		data2.sumMethod(0);
		
	}

}
