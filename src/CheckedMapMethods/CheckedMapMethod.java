package CheckedMapMethods;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CheckedMapMethod {
	
	// Java program to Demonstrate checkedMap() method
	// of Collections class

	// Importing required classes
	
	// Main driver method
		public static void main(String[] argv) throws Exception
		{

			// Try block to check for exceptions
			try {

				// Creating an empty HashMap by declaring
				// HashMap key-value pairs
				// of string and string type
				HashMap<String, String> hmap= new HashMap<String, String>();

				// Adding custom key-value pairs to above
				// HashMap
				hmap.put("Ram", "Shyam");
				hmap.put("Karan", "Arjun");
				hmap.put("Karn", "Veer");
				hmap.put("duryodhan", "dhrupat");

				// Printing all the key-value pairs of above
				// HashMap
				System.out.println("Map: \n" + hmap);

				// Now creating typesafe view of the specified
				// map using checkedMap() method of Collections
				// class
				Map<String, String> tsmap= Collections.checkedMap(hmap, String.class,String.class);

				// Now printing the typesafe view of specified
				// list
				System.out.println("Typesafe view of Map: "	+ tsmap);
			}

			// Catch block to handle the exceptions
			catch (IllegalArgumentException e) {

				// Display message when exception occurs
				System.out.println("Exception thrown : \n" + e);
			}
		}
	}



