package singleton;

public class Singleton {
	private static Singleton instance;
	private static int x = 0;

	// Constructor is private so cannot be initiated outside class
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null){
			instance = new Singleton();
			x = 5;
		}
		return instance;
	}

	public static int getX() {
		return x;
	}

	

}
