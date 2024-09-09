package decoratorPattern;

public class CheeseDecorator extends PizzaDecorator {
	
	public CheeseDecorator(BasePizza decoratedPizza) {
		super(decoratedPizza);
	}
	
	
	 @Override
	    public String getDescription() {
	        return decoratedPizza.getDescription() + ", cheese";
	    }

	    @Override
	    public double cost() {
	        return decoratedPizza.cost() + 1.5; 
	    }

}
