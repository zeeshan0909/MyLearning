package decorator;

public class Farmhouse extends BasePizza{

	@Override
	public int cost() {
		System.out.println("the price of Farmhouse pizza is 200 rs.");
		return 200;
	}

}
