package behavioral.designpattern.strategy;

public class App {
	
	public static void main(String[] args) {
		OperationManager manager = new OperationManager();
		manager.setStrategy(new Subtraction());
		
		int substraction = manager.execute(5, 2);
		
		System.out.println(substraction);
	}
	
}
