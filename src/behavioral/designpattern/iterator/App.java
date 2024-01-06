package behavioral.designpattern.iterator;

public class App {
	
	public static void main(String[] args) {
		NameRepository repository = new NameRepository();
		
		for(Iterator it = repository.getIterator(); it.hasNext();) {
			String name = (String) it.next();
			
			System.out.println(name);
		}
	}
	
}
