package decorator;

public class Mashroom extends Topping{
	
	BasePizza basePizza;
	
	public Mashroom(BasePizza pizza) {
		this.basePizza = pizza;
	}

	@Override
	public int cost() {
		System.out.println("price for mashroom is "  + 50);
		int total_amount = this.basePizza.cost() + 50;
		System.out.println("the total amount with mashroom is  " + this.basePizza.cost() + " + 50 = " + total_amount);
		return total_amount;
	}

}
