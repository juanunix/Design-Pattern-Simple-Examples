package proxy;
public class ProxyObject implements ProxyExample
{
	private RealObject realObject = new RealObject();
	
	@Override
	public void run() 
	{
		if(realObject == null)
		{
			realObject = new RealObject();
	    }
		
		realObject.run();
	}
}
