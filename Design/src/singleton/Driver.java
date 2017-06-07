package singleton;
// The Singleton Design Pattern is a Creational based Design Pattern. It is used when only a single instance of a class
// should be used.  The constructor is usually private so outside classes can not initiate instances of the Singleton class
public class Driver {
	// All instances will refer to the same instance
	private static Singleton s1, s2, s3;
	
	public static void main(String[] args) {
		System.out.println(s1.getInstance() + "    X = " + s1.getX());
		System.out.println(s2.getInstance() + "    X = " + s2.getX());
		System.out.println(s3.getInstance() + "    X = " + s3.getX());

	}



}
