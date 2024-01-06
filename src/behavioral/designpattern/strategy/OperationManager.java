package behavioral.designpattern.strategy;

public class OperationManager {

	// we have to use composition
	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int execute(int num1, int num2) {
		return this.strategy.execute(num1, num2);
	}

}
