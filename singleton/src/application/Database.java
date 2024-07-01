package application;

public class Database {
	
	private static Database instance;
	
	int value = 0;
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		
		if (instance==null) {
			
			instance = new Database();
			
		} 
		
		return instance;	
	}
	
	public void sumMethod(int value) {
		this.value += value;
		System.out.println(this.value);
	}
	

}
