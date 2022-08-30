package module2;

import java.util.HashSet;
import java.util.Iterator;

public class b32 {
	public static void main(String[] args) {  
        HashSet<String> aa=new HashSet<String>();    
        aa.add("Ridham");    
        aa.add("Jay");    
        aa.add("Anshu");    
            
           System.out.println("the hash set"+aa);
        Iterator<String> itr=aa.iterator();    
        while(itr.hasNext()){    
           System.out.println(itr.next());    
        }    
    }
}
