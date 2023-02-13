package HashSet;

import java.util.HashSet;

public class HashSet3 { 
		 public static void main(String args[]){  
		  HashSet<String> set=new HashSet<String>();  
		           set.add("Pankaj");  
		           set.add("Gosavi");  
		           set.add("Vashali");  
		           set.add("Bharati");  
		           System.out.println("An initial list of elements: "+set);  
		           //Removing specific element from HashSet  
		           set.remove("Bharati");  
		           System.out.println("After invoking remove(object) method: "+set);  
		           HashSet<String> set1=new HashSet<String>();  
		           set1.add("Brahma");  
		           set1.add("Yuga");  
		           set.addAll(set1);  
		           System.out.println("Updated List: "+set);  
		           //Removing all the new elements from HashSet  
		           set.removeAll(set1);  
		           System.out.println("After invoking removeAll() method: "+set);  
		           //Removing elements on the basis of specified condition  
		           set.removeIf(str->str.contains("Vaishali"));    
		           System.out.println("After invoking removeIf() method: "+set);  
		           //Removing all the elements available in the set  
		           set.clear();  
		           System.out.println("After invoking clear() method: "+set);  
		 }  
	}
	/*
	 * OUTPUT	
	 * Java HashSet example to remove elements
Here, we see different ways to remove an element.
	 * 
	 * An initial list of elements: [Bharati, Gosavi, Pankaj, Vashali]
After invoking remove(object) method: [Gosavi, Pankaj, Vashali]
Updated List: [Gosavi, Brahma, Pankaj, Yuga, Vashali]
After invoking removeAll() method: [Gosavi, Pankaj, Vashali]
After invoking removeIf() method: [Gosavi, Pankaj, Vashali]
After invoking clear() method: []
	
*/