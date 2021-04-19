package jp;

import java.util.Scanner;

class Read {
	public static void main(String args[]) {
		// Using Scanner for Getting Input from User
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter a string:");
			String s = obj.nextLine();
			System.out.println("You entered string " + s);
			System.out.println("Now enter an integer:");
			int a = obj.nextInt();
			System.out.println("You entered integer " + a);
			System.out.println("Enter a float value:");
			float b = obj.nextFloat();
			System.out.println("You entered float " + b);
		}

	}
}
