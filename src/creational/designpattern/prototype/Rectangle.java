package creational.designpattern.prototype;

public class Rectangle extends Shape {

	public Rectangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		System.out.println(String.format("Rectangle with width: %d height: %d", width, height));

	}

	@Override
	public Shape cloneObject() {
		// TODO Auto-generated method stub
		return new Rectangle(width, height);
	}

}
