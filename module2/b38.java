package module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b38 {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("ridham");
		list.add("jay");
		list.add("mihir");
		list.add("anshu");
		list.add("shrey");
		System.out.println(list);
		List<String> list1=list.subList(0, 3);
		System.out.println("the element"+list1);
	}
}
