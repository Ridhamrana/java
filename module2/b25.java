package module2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b25 {
	public static void main(String[] args) {
		 List list = new ArrayList();
		  list.add("Ridham");
		  list.add("Rana");
		  list.add("1");
		  list.add("@");
		  list.add("12345");
		  System.out.println(list);
	      Scanner sc= new Scanner(System.in);
		  String element;
	      element = (String) list.get(sc.nextInt());
	      System.out.println("the index is : "+element);
		
	}
}
