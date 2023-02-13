/*HashSet

	 HashSet class implements Set Interface. It represents the collection that uses a hash table for storage.
	 Hashing is used to store the elements in the HashSet. It contains unique items.*/

package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Demo {
	
	public static void main(String args[]){  
	//Creating HashSet and adding elements  
	HashSet<String> set=new HashSet<String>();  
	set.add("Pankaj");  
	set.add("Vaishali");  
	set.add("Ravi");  
	set.add("Ajay");  
	//Traversing elements  
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  
	

	/*Output:
	  Ravi
   Vaishali
   Pankaj
    Ajay*/
