package LinkedList;

public class Book implements Comparable<Book>{  
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Book(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
	public int compareTo(Book b) {  
	    if(id>b.id){  
	        return 1;  
	    }else if(id<b.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}  
	}  

/*Java PriorityQueue Example: Book
Let's see a PriorityQueue example where we are adding books to queue and printing all the books.
 The elements in PriorityQueue must be of Comparable type. String and Wrapper classes are Comparable by default.
  To add user-defined objects in PriorityQueue, you need to implement Comparable interface.

FileName: LinkedListExample.java*/


//OUTPUT
/*101 Data Communications & Networking Forouzan Mc Graw Hill 4
233 Operating System Galvin Wiley 6
121 Let us C Yashwant Kanetkar BPB 8
After removing one book record:
121 Let us C Yashwant Kanetkar BPB 8
233 Operating System Galvin Wiley 6
*/