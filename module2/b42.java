package module2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class b42 {
	 public static void main(String[] args)
	    {
	        HashSet<String> list = new HashSet<String>();
	    	
	    	list.add("dragon ball");
	    	list.add("naruto");
	    	list.add("one piece");
	    	list.add("beyblade");
	    	System.out.println("Anime:"+list);
	        String arr[] = new String[list.size()];
	        list.toArray(arr);
	        for(String ee:arr){
	          System.out.println(ee);
	        }
	  
	      
	    }
	
}
