package adapter;
// The Adapter Design Pattern is a Structural based Design Pattern.  Adapter Design Patterns allow Classes, with incompatible
// design/Interfaces, to work together.  An Adapter Class is created to provide a bridging mechanism between classes that could not
// work together without this specific Adapter Class.  A real world example for using this pattern would be using an Adapter to
// allow a Class to implement Methods in inaccessible Interfaces etc.  An Adapter Design Pattern may contain Classes with different
// roles, for example the incompatible Interface could be referred to as the Target because the reason for implementing the pattern
// is to work with this Interface/component etc.  The Adaptee or Class to be adapted is the component that needs an adapter to work
// with the Target and the Adapter is the Adapter Class that will apply this adaption between the Target and the Adaptee etc.
public class Driver {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee("Adaptee Object");
		Adapter adapter = new Adapter(adaptee);
		adapter.run();
	}
}
