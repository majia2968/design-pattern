package decorator;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		
		Beverage mocha = new Mocha(beverage);
		System.out.println(mocha.cost());
	}

}
