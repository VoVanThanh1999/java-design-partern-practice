package com.thanhvvit11.pattern.servicelocator;

public class App {
	
	public static void main(String[] args) {
		Service service = ServiceLocator.getService("databaseService");
		service.execute();
	}
	
}
