package structural.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	// we will create a rectangle for every color
	private Map<String, Shape> shapes;

	public ShapeFactory() {
		shapes = new HashMap<>();
	}
	
	// get a shape based on a give color
	public Shape getShape(String color) {
		if(shapes.containsKey(color)) {
			return shapes.get(color);
		}
		
		Shape shape = new Rectangle(color);
		shapes.put(color, shape);
		return shape;
	}

}
