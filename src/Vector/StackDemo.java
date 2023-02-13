package Vector;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
 
	public static void main(String args[]){  
	Stack<String> stack = new Stack<String>();  
	stack.push("Pankaj");  
	stack.push("Vaishali");  
	stack.push("Bramhaa");  
	stack.push("Kavya");  
	stack.push("Yuga");  
	stack.pop();  
	Iterator<String> itr=stack.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  


/*Stack
The stack is the subclass of Vector. It implements the last-in-first-out data structure,
 i.e., Stack. The stack contains all of the methods of Vector class and also provides its 
 methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.*/

//Output
//Pankaj
//Vaishali
//Bhramha
//Kavya