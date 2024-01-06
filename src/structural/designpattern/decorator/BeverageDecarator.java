package structural.designpattern.decorator;

public abstract class BeverageDecarator implements Beverage {

	protected Beverage beverage;
	
	public BeverageDecarator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public int getCost() {
		// all the beverages start at $5
		return this	.beverage.getCost();
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription();
	}

 

}
