package creational.designpattern.prototype;

public class Square extends Shape {

	public Square(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		System.out.println(String.format("Square with width: %d height: %d", width, height));

	}

	@Override
	public Shape cloneObject() {
		return new Square(width, height);
	}
}
