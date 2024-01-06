package creational.designpattern.absfactory;

public class App {
	
	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory("ELECTRIC");
		factory.getCar("TOYOTA").assemble();
	 
	}
	
}
