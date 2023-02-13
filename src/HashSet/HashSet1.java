/*Java HashSet Example
Let's see a simple example of HashSet. Notice, the elements iterate in an unordered collection.*/

package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	 public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		    HashSet<String> set=new HashSet();  
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five");  
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next());  
		           }  
		 }  
		}  

/*OUTPUT
		Five
		One
		Four
		Two
		Three*/


