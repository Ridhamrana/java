package module2;

import java.util.Scanner;

public class b23 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a = sc.nextInt();
		System.out.println("Enter the second value: ");
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divisible by zero");
		}
	}
}
