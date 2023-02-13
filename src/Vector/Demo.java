package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Demo {
	
	public static void main(String args[]){  
	Vector<String> v=new Vector<String>();  
	v.add("Pankaj");  
	v.add("Amit");  
	v.add("Ashish");  
	v.add("Garima");  
	Iterator<String> itr=v.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  



/*Vector
Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However,
 It is synchronized and contains many methods that are not the part of Collection framework.

Consider the following example.*/

//	Output:
//
//	Ayush
//	Amit
//	Ashish
//	Garima


