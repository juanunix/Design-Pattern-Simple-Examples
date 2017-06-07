package adapter;
public class Adapter implements Target
{
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee)
	{
		this.adaptee = adaptee;
	}
	
	@Override
	public void run() 
	{
		System.out.println("This message ensures Target Run Method has been accessed by " + adaptee.getName());
	}
}
