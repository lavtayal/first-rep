package LB2;

import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		// TODO String Case Operation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = scan.nextLine();
		scan.close();
		Sort string = new Sort(input);
		System.out.println("String: " + string.sortStrings());
		
	}

}
