package module2;

import java.util.ArrayList;
import java.util.List;


public class b26 {
	public static void main(String[] args) {
		 List list = new ArrayList();
		  list.add("Ridham");
		  list.add("Rana");
		  list.add("1");
		  list.add("@");
		  list.add("12345");
		  System.out.println(list);
	      list.set(3, "Anshu");
	      System.out.println("update list:"+list);
		
	}
}
