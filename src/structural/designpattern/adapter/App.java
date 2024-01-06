package structural.designpattern.adapter;

public class App {
	
	public static void main(String[] args) {
		Vehicle bus = new Bus();
		Vehicle car = new Car();
		Vehicle bicycle = new BicycleAdapter(new Bicycle());
		
		bicycle.accelerate();
	}
	
}
