package creational.designpattern.prototype;

public class App {

	public static void main(String[] args) {
		Shape square = new Square(5, 6);
		square.draw();

		Shape squareClone = square.cloneObject();
		squareClone.draw();
	}

}
