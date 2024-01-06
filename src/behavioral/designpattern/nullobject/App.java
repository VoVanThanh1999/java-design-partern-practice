package behavioral.designpattern.nullobject;

public class App {
	
	public static void main(String[] args) {
		CustomerFactory customerFactory = new CustomerFactory();
		AbstractCustomer abstractCustomer = customerFactory.getCustomer("Adam");
		System.out.println(abstractCustomer.getCustomer());
	}
	
}
