package decorator;

public class UsePizza {
	
	public static void main(String[] args) {
		BasePizza pp = new ExtraChease(new Magherita());
		pp.cost();
		System.out.println("+++++++++++++++++++++++++++++++++");
		BasePizza ppp = new ExtraChease(new Mashroom(new Vegdelight()));
		ppp.cost();
		
	}

}
