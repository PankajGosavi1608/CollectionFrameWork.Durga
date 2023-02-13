package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	
	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
}
/*Java HashSet example ignoring duplicate elements
In this example, we see that HashSet doesn't allow duplicate elements.*/