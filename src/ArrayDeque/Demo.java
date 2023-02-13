package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo {

	public static void main(String[] args) {  
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Pankaj");  
		deque.add("Vaishali");  
		deque.add("Bramha");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  
		}  
		}  

/*ArrayDeque
ArrayDeque class implements the Deque interface. It facilitates us to use the Deque.
 Unlike queue, we can add or delete the elements from both the ends.

ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.*/