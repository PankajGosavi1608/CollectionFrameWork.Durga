package PriorityQue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Demo {

	public static void main(String args[]){  
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("Pankaj Gosavi");  
	queue.add("Vaishali Bharati");  
	queue.add("Xavier");  
	queue.add("Yuga");  
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	System.out.println("iterating the queue elements:");  
	Iterator itr=queue.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	queue.remove();  
	queue.poll();  
	System.out.println("after removing two elements:");  
	Iterator<String> itr2=queue.iterator();  
	while(itr2.hasNext()){  
	System.out.println(itr2.next());  
	}  
	}  
	}  

/*PriorityQueue
The PriorityQueue class implements the Queue interface.
 It holds the elements or objects which are to be processed by their priorities.
  PriorityQueue doesn't allow null values to be stored in the queue.*/

//	Output:
//
/*	head:Pankaj Gosavi
head:Pankaj Gosavi
iterating the queue elements:
Pankaj Gosavi
Vaishali Bharati
Xavier
Yuga
after removing two elements:
Xavier
Yuga*/


