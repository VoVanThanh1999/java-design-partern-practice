package com.thanhvvit11.pattern.servicelocator;

public class InitialContext {
	
	public Object lookup(String jndiName) {
		 switch (jndiName) {
		case DatabaseService.NAME:  
			return new DatabaseService();
		case MessagingService.NAME:
			return new MessagingService();
		default:
			return null;
		}
	}
	
}
