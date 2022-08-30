package module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b37 {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("ridham");
		list.add("jay");
		list.add("mihir");
		list.add("anshu");
		list.add("shrey");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("Reverse method"+list);
	}
}
