package behavioral.designpattern.template;

public class App {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		
		Algorithm bubbleSort = new BubbleSort(a);
		bubbleSort.sort();
	}
}
