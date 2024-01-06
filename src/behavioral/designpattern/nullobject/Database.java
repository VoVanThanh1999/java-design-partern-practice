package behavioral.designpattern.nullobject;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<String> listCustomerName;
	
	public Database() {
		this.listCustomerName = new ArrayList<>();
		this.listCustomerName.add("Adam");
		this.listCustomerName.add("Joe");
		this.listCustomerName.add("Michael");
		this.listCustomerName.add("Daniel");
		this.listCustomerName.add("Ana");
	}
	
	public boolean exist(String name) {
		for(String customer: listCustomerName) {
			if(customer.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
}
