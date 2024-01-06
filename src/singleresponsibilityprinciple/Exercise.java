package singleresponsibilityprinciple;

import java.util.*;
import java.util.Scanner;

public class Exercise {
	public static final int THRESHOLD = 5;

	public static void main(String[] args) {

		System.out.println("Welcome to the Application!");

		Scanner scanner = new Scanner(System.in);
		
		List<Integer> nums = new ArrayList<>();
		
		insertInterger(scanner, nums);

		Collections.sort(nums);

		printArrays(nums);
	}
	
	public static void insertInterger(Scanner scanner, List<Integer> nums) {

		System.out.println("Enter 5 valid integers in the range [0, 10]");

		while (nums.size() < THRESHOLD) {

			String s = scanner.nextLine();
			
			// check valid Interger
			if(!isValidInterger(s)) continue;
			
			// parse integer
			int num = Integer.parseInt(s);

			// check valid ranger
			if(!isValidRanger(num)) continue;

			nums.add(num);
		}
		
		System.out.println();
		
		scanner.close();
	}
	
	public static boolean isValidRanger(Integer num) {
		if (num < 0 || num > 10) {
			System.out.println("Invalid range! Try again!");
			return false;
		}
		return true;
	}
	
	public static boolean isValidInterger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException nfe) {
			System.out.println("Invalid! Try again!");
			return false;
		}
	}
	
	public static void printArrays(List<Integer> array) {
		for(Integer val: array) {
			System.out.print(val+" ");
		}
	}
	
}
