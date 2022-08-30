package module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b31 {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("ridham");
		list.add("jay");
		list.add("mihir");
		list.add("anshu");
		list.add("shrey");
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println("Shuffle method"+list);
	}
}
