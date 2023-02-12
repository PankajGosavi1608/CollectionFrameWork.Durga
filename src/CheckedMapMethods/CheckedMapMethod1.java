package CheckedMapMethods;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CheckedMapMethod1 {

	
	
	// Java program to demonstrate checkedMap() method
	// of Collections class

	// Importing all required classes

		// Main driver method
		public static void main(String[] argv) throws Exception
		{

			// Try block to check for exceptions
			try {

				// Creating an empty HashMap by
				// declaring object of string and integer type
				HashMap<String, Integer> hmap= new HashMap<String, Integer>();

				// Adding key-value pairs to above HashMap
				// object
				hmap.put("Player-1", 20);
				hmap.put("Player-2", 30);
				hmap.put("Player-3", 40);

				// Printing the elements inside above HashMap
				// object
				System.out.println("Map: \n" + hmap);

				// Now creating typesafe view of the specified
				// map using checkedMap() method
				Map<String, Integer> tsmap= Collections.checkedMap(hmap, String.class,Integer.class);

				// Again printing the typesafe view of specified
				// list
				System.out.println("Typesafe view of Map: \n"+ tsmap);
			}

			// Catch block to handle exceptions
			catch (IllegalArgumentException e) {

				// Display message when exception occurs
				System.out.println("Exception thrown : " + e);
			}
		}
	}


