package module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b40 {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("ridham");
	list.add("jay");
	list.add("anshu");
	list.add("jaimin");
	System.out.println(list);
	Collections.swap(list, 2, 1);
	System.out.println("Swap list"+list);
}
}
