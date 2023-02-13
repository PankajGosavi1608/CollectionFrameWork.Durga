package TreeSet;

import java.util.TreeSet;

public class ClassCastExceptionTreeSet {
	
	// main method  
	public static void main(String[] argvs)  
	{  
	// creating objects of the class Employee  
	Employee obj1 = new Employee();  
	  
	Employee obj2 = new Employee();  
	  
	TreeSet<Employee> ts =  new TreeSet<Employee>();  
	  
	// adding the employee objects to   
	// the TreeSet class  
	ts.add(obj1);  
	ts.add(obj2);  
	  
	System.out.println("The program has been executed successfully.");  
	  
	}  
	}  



/*Output and Explanation
Exception in thread "main" java.lang.ClassCastException: class Employee cannot be cast to class java.lang.Comparable (Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
at java.base/java.util.TreeMap.put(TreeMap.java:785)
at java.base/java.util.TreeMap.put(TreeMap.java:534)
at java.base/java.util.TreeSet.add(TreeSet.java:255)
at ClassCastExceptionTreeSet.main(ClassCastExceptionTreeSet.java:52)

Explanation: In the above program, it is required to implement a Comparable interface. 
It is because the TreeSet maintains the sorting order, and for doing the sorting the comparison
 of different objects that are being inserted in the TreeSet is must, which is accomplished by 
 implementing the Comparable interface.*/