package module2;

import java.util.ArrayList;
import java.util.List;

public class b47 {
	public static void main(String[] args) {
		  List<String> list = new ArrayList<String>();
		  list.add("ridham");
			list.add("jay");
			list.add("mihir");
			list.add("anshu");
		 System.out.println("The list of first element: " + list);
		  List<String> list1 = new ArrayList<String>();
		  list1.add("ridham");
		  list1.add("jaimin");
		  list1.add("heet");
		  list1.add("jay");
		  System.out.println("The list of second element: " + list1);
		  list.retainAll(list1);
		  System.out.println("retain"+list);
	}
}
