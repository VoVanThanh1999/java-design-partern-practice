package structural.designpattern.facade;

public class SortingManager {

	private Sorter bubbeSort;
	private Sorter quicksort;
	private Sorter mergeSort;

	public SortingManager() {
		super();
		this.bubbeSort = new BubbleSort();
		this.quicksort = new QuickSort();
		this.mergeSort = new MergeSort();
	}

	public void doBubbeSort() {
		this.bubbeSort.sort();
	}

	public void doQuicksort() {
		this.quicksort.sort();
	}

	public void doMergeSort() {
		this.mergeSort.sort();
	}

}
