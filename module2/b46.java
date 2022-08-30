package module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b46 {
	   public static void main(String[] args) {
		   List<String> list=new ArrayList<>();
		   list.add("dragon ball");
		   list.add("naruto");
		   list.add("one piece");
		   list.add("demon slayer");
		   System.out.println(list);
		   
		   int i=list.size();
		   for (int j=0;j<i;j++) {
			System.out.println(list.get(j));
			
		}
		  }
}
