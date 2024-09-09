package decoratorPattern;

public abstract class PizzaDecorator implements BasePizza{
	protected BasePizza decoratedPizza;
	
	public PizzaDecorator(BasePizza pizzaDecorator) {
		this.decoratedPizza = pizzaDecorator;
	}
	
	  @Override
	    public String getDescription() {
	        return decoratedPizza.getDescription();
	    }

	    @Override
	    public double cost() {
	        return decoratedPizza.cost();
	    }

}
