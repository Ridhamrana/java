package module1;

import java.util.Scanner;

public class b9 {
	   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char chr;
		System.out.println("Enter Any Character");
		chr=sc.next().charAt(0);
		int AsciiValue=chr;
		System.out.println("AsciiValue OF "+ chr + " is = " + AsciiValue);
		}
}
