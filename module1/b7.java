package module1;

import java.util.Scanner;

public class b7 {
	public static void main(String[] args) {
		int Digit;
		int Count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Digit");
		Digit=sc.nextInt();
		while (Digit>0) {
		Digit=Digit/10;
		Count=Count+1;
		}
		System.out.println("NUMBER OF DIGIT : " + Count);
		} 
}


