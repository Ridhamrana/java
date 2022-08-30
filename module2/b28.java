package module2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b28 {
	public static void main(String[] args) {
		 List list = new ArrayList();
		  list.add("Ridham");
		  list.add("Rana");
		  list.add("1");
		  list.add("@");
		  list.add("12345");
		  System.out.println(list);
	      if(list.contains("Rana")) {
	    	  System.out.println("found element");
	      }
	      else {
	    	  System.out.println("not found element");
	      }
	}
}
