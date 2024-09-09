package decorator;

public class Vegdelight extends BasePizza {

	@Override
	public int cost() {	
		System.out.println("the price of Vegdelight pizza is 120 rs.");
		return 120;
	}

}
