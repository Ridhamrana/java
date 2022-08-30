package module2;

import java.util.ArrayList;
import java.util.List;

public class b41 {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("dragon ball");
	list.add("naruto");
	list.add("one piece");
	list.add("beyblade");
	System.out.println("Anime:"+list);
	List<String> list1=new ArrayList<>();
	list1.add("hawkeye");
	list1.add("loki");
	list1.add("daredevil");
	list1.add("moon knight");
	System.out.println("marvel webseries:"+list1);
	List<String> l=new ArrayList<>();
	l.addAll(list);
	l.addAll(list1);
	System.out.println("new array"+l);
}
}
