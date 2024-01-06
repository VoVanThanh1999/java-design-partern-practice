package behavioral.designpattern.template;

public class BubbleSort extends Algorithm{

	public BubbleSort(int[] nums) {
		super(nums);
	}

	@Override
	protected void initalize() {
		System.out.println("Initalize sort bubble");
	}

	@Override
	protected void sorting() {
		System.out.println("Sorting sort bubble");
		
	}

	@Override
	protected void showResult() {
		System.out.println("Show sort bubble");
		
	}

}
