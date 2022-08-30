package module2;

import java.util.ArrayList;
import java.util.List;

public class b39 {
	public static void main(String[] args) {
		  List<String> list = new ArrayList<String>();
		  list.add("ridham");
			list.add("jay");
			list.add("mihir");
			list.add("anshu");
		 System.out.println("The list of first element: " + list);
		  List<String> list1 = new ArrayList<String>();
		  list1.add("ridham");
		  list1.add("jay");
		  list1.add("mihir");
		  list1.add("anshu");
		  System.out.println("The list of second element: " + list1);
		  boolean br=list.equals(list1);
		  System.out.println(br);
		 
	}
}
