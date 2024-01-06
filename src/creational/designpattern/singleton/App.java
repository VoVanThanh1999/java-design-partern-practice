package creational.designpattern.singleton;

public class App {
	
	public static void main(String[] args) {
//		DatabaseConnector o1 = DatabaseConnector.getInstance();
//		DatabaseConnector o2 = DatabaseConnector.getInstance();
		
		Database o1 = Database.INSTANCE;
		Database o2 = Database.INSTANCE;
		
		System.out.println(o1.equals(o2));
	}
	
}
