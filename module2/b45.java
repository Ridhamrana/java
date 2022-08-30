package module2;

import java.util.ArrayList;
import java.util.List;

public class b45 {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("naruto");
	list.add("one piece");
	System.out.println(list);
	String list1="dragon ball";
	list.set(1, list1);
	System.out.println("replace"+list);
	
}
}
