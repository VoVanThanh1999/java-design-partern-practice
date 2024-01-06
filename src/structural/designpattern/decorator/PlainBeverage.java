package structural.designpattern.decorator;

public class PlainBeverage implements Beverage {

	@Override
	public int getCost() {
		// all the beverages start at $5
		return 0;
	}

	@Override
	public String getDescription() {
		return "";
	}

 

}
