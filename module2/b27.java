package module2;

import java.util.ArrayList;
import java.util.List;

public class b27 {
	public static void main(String[] args) {
		 List list = new ArrayList();
		  list.add("Ridham");
		  list.add("Rana");
		  list.add("1");
		  list.add("@");
		  list.add("12345");
		  System.out.println(list);
	      list.remove(2);
	      System.out.println("remove list:"+list);
		
	}
}
