package decorator;

public class ExtraChease extends Topping{
	
	BasePizza basePizza;
	
	public ExtraChease(BasePizza pizza) {
		this.basePizza = pizza;
	}
	
	@Override
	public int cost() {
		System.out.println("price of extra chease is " + 10);
		int total_amount = this.basePizza.cost() + 10;
		System.out.println("the total amoutn with extra chease is " + this.basePizza.cost() + " + 10  = " + total_amount);
		return total_amount;
		
	}
	
}
