package com.thanhvvit11.pattern.servicelocator;

public class DatabaseService implements Service{

	public static final String NAME = "databaseService";
	
	@Override
	public String getName() {
		return DatabaseService.NAME;
	}

	@Override
	public void execute() {
		System.out.println("Executing database service...");
		
	}

}
