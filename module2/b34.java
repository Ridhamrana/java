package module2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class b34 {
	public static void main(String[] args) {  
        HashSet<String> aa=new HashSet<String>();    
        aa.add("Ridham");    
        aa.add("Jay");    
        aa.add("Anshu");    
            
           System.out.println("the hash set"+aa);
           System.out.println("size of set:"+aa.size());
        Iterator<String> itr=aa.iterator();    
        while(itr.hasNext()){    
           System.out.println(itr.next());    
        }    
    }
	
}
