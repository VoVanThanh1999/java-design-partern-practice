package structural.designpattern.decorator;

public class App {
	
	public static void main(String[] args) {
		Beverage beverage = new Sugar(new Sugar(new Sugar(new PlainBeverage())));
		
	}
	
}
