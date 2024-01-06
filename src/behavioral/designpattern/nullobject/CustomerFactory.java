package behavioral.designpattern.nullobject;

public class CustomerFactory {
	
	private Database database;
	
	public CustomerFactory() {
		this.database = new Database();
	}
	
	public AbstractCustomer getCustomer(String name) {
		if(this.customerExists(name)) {
			return new RealCustomer(name);
		}
		
		return new NullCustomer();
	}
	
	private boolean customerExists(String name) {
		if(database.exist(name)) {
			return true;
		}
		return false;
	}
	
}
