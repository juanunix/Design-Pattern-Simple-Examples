package proxy;
// The Proxy Design Pattern is a Structural based Design Pattern.  In a Proxy Design Pattern an Object will be created to represent
// another Object, and this surrogate/proxy Object will be able to control access to the actual/real Object.  Essentially the
// Proxy Object is representing the Real Object but when external components wish to access the Real Object they will actually
// be interacting with the Proxy Object, i.e. providing access by Proxy.
public class Driver {
	public static void main(String[] args) {
		ProxyObject proxyObject = new ProxyObject();
		proxyObject.run();
	}
}
