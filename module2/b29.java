package module2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class b29 {
public static void main(String[] args) {
	List<String> list= new ArrayList<>();
	list.add("ridham");
	list.add("jay");
	list.add("mihir");
	list.add("anshu");
	list.add("shrey");
	System.out.println(list);
	Collections.sort(list);
	System.out.println("Sorting method"+list);
}
}
