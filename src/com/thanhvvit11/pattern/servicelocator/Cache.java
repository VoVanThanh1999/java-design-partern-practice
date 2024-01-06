package com.thanhvvit11.pattern.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	
	private List<Service> listOfService;
	
	public Cache() {
		this.listOfService = new ArrayList<>();
	}
	
	public Service getService(String jndiName) {
		for(Service s: listOfService) {
			if(s.getName().equals(jndiName)) {
				return s;
			}
		}
		
		return null;
	}
	
	public void addService(Service service) {
		this.listOfService.add(service);
	}
	
}
