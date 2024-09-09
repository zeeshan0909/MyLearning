package decorator;

public class Magherita extends BasePizza {

	@Override
	public int cost() {
		System.out.println("the price of Magherita pizza is 100 rs.");
		return 100;
	}

}
