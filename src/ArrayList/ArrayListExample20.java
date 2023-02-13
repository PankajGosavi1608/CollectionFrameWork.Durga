package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample20 {
	
	public static void main(String[] args) {  
	    //Creating list of Books  
	    List<Book1> list=new ArrayList<Book1>();  
	    //Creating Books  
	    Book1 b1=new Book1(101,"Let us C","Pankaj Gosavi","BikkadIT",06);  
	    Book1 b2=new Book1(102,"Java Full stack Web Development","Language","Santosh Bikkad",4);  
	    Book1 b3=new Book1(103,"Operating System","Windows-10","MS",06);  
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    //Traversing list  
	    for(Book1 b:list){  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}

}
