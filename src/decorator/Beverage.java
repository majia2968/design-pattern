package decorator;

public abstract class Beverage {
	
	String description = "unkown discription";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	

}
