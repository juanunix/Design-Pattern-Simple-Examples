package factory;
// The Factory Design Pattern is a Creational based Design Pattern. It is widely used and provides one of the best ways
// to initiate objects
public class Driver {

	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.SMALL));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}

}
