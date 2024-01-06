package structural.designpattern.decorator;

public class Milk extends BeverageDecarator{

	public Milk(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getCost() {
		// we sum up the cost + $3
		return this	.beverage.getCost();
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " milk";
	}

}
