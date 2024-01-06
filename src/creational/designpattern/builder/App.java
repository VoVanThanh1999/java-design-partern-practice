package creational.designpattern.builder;

import creational.designpattern.builder.Student.Builder;

public class App {
	public static void main(String[] args) {
		Builder builder = new Builder("ThanhVVIT11", "Dong A");
		
		Student s = builder.build();
		System.out.println(s.toString());
	}
}
