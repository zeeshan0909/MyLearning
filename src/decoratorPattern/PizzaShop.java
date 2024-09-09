package decoratorPattern;

public class PizzaShop {
	public static void main(String[] args) {
		BasePizza pp = new PlainPizza();
		System.out.println("this is for plainPizza "+pp.getDescription() + " $" + pp.cost());
		BasePizza cd = new CheeseDecorator(pp);
		System.out.println("this is for CheeseDecorator pizza " + cd.getDescription() + " $" + cd.cost());
	}

}
