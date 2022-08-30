package module1;

import java.util.Scanner;

public class b3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the year: ");
		int year = in.nextInt();
		boolean x = (year % 4) == 0;
		boolean y = (year % 100) != 0;
		boolean z = ((year % 100 == 0) && (year % 400 == 0));
		if (x && (y || z)) {
		System.out.println(year + " is a leap year");
		} else {
		System.out.println(year + " is not a leap year");
		}
		int i;
		System.out.println("The first 10 natural numbers are:\n");
		for (i = 1; i <= 10; i++) {
		System.out.println(i);
		}
		System.out.println("\n");
		}
}
