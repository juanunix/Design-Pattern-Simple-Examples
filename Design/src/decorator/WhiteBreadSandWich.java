package decorator;
import java.math.BigDecimal;

/** * A Concrete implementation of abstract Sandwich class, which represent a WhiteBread 
 * * Sandwich, whose price is 3.0$. */


public class WhiteBreadSandWich extends Sandwich{
	
	public WhiteBreadSandWich(String desc){ 
		description = desc; 
		} 
	
	@Override 
	public BigDecimal price() { 
		return new BigDecimal("3.0"); 
		}
}
