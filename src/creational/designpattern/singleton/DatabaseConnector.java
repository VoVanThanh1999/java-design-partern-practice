package creational.designpattern.singleton;

public class DatabaseConnector {
	
	private static DatabaseConnector INSTANCE;
	
	// we are not able instantiate the class
	private DatabaseConnector() {
		
	}
	
	public static DatabaseConnector getInstance() {
		// we just instantiate the class if necessary
		if(INSTANCE == null) {
			synchronized (DatabaseConnector.class) {
				INSTANCE = new DatabaseConnector();
			}
			
		}
		return INSTANCE;
	}
	
	public void connect() {
		System.out.println("Connecting to the database");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting...");
	}
	
}
