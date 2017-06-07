package decorator;

import java.math.BigDecimal;

public class BrownBreadSandWich extends Sandwich{

	public BrownBreadSandWich(String desc) {
		description = desc;
	}

	@Override
	public BigDecimal price() {
		return new BigDecimal("3.25");
	}

}
