package module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b30 {
	public static void main(String[] args) {
		  List<String> list = new ArrayList<String>();
		  list.add("ridham");
			list.add("jay");
			list.add("mihir");
			list.add("anshu");
		 System.out.println("The list of first element: " + list);
		  List<String> list1 = new ArrayList<String>();
		  list1.add("shrey");
		  list1.add("jaimin");
		  list1.add("heet");
		  list1.add("rohan");
		  System.out.println("The list of second element: " + list1);
		  List<String> list2 = new ArrayList<String>();
		  list2.add("A");
		  list2.add("B");
		  list2.add("C");
		  list2.add("B");
		  System.out.println("The list of second element: " + list2);
		  Collections.copy(list, list1);
		  Collections.copy(list2, list1);
		  System.out.println("After copy:");
		  System.out.println("The list of first element: " + list);
		  System.out.println("The list of second element: " + list1);
		  System.out.println("The list of second element: " + list2);
		 }
}
