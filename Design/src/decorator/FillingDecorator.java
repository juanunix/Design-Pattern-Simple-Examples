package decorator;

import java.math.BigDecimal;

public class FillingDecorator extends SandWichDecorator{
	
	Sandwich currentSandwich;
	
	public FillingDecorator(Sandwich sw) {
		currentSandwich = sw;
	}
	
	@Override 
	public String getDescription(){ 
		return currentSandwich.getDescription() + " with Extra Fillings"; 
		}
	
	@Override
	public BigDecimal price() {
		return currentSandwich.price().add(new BigDecimal("0.75"));
	}

}
