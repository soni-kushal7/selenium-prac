package Day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		//String methods
		
		
		//String s= "welcome";
		//String s1= new String ("welcome"); // to declare string both ways are correct
		//System.out.println(s);
		//System.out.println(s1);
	
		
/*		
		
---------------------------------------------------------------------------------------------------------------------		

//1. length() method	
Usage: Returns the number of characters in a string.
		
		String s = "welcome";
		int lenth = s.length();
		//System.out.println(s.length());
		System.out.println(lenth);
		System.out.println("welcome".length());
		
----------------------------------------------------------------------------------------------------------------------				
*/		
			
		
/*			
---------------------------------------------------------------------------------------------------------------------		
//2. Concat()----->used to join (combine) two strings. 
	            * It does not modify the original string but returns a new combined string.	
			
				
		String s1= "welcome";
		String s2= "to java";
		String s3= "automation";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));		
		System.out.println(s1+s2+s3);		
		System.out.println(s1. concat( s2). concat( s3));
		System.out.println(s1.concat(s2+s3));
		
		System.out.println("welcome".concat(" to java").concat(" automation"));
		
----------------------------------------------------------------------------------------------------------------------																		
 */		

		
		
/*			
---------------------------------------------------------------------------------------------------------------------		
	
//3. trim()-----> Usage: Removes extra spaces at the beginning and end of a string.
				
		String s="   welcome   ";
		System.out.println("Before trim :".concat(s));  //print string along with spaces
		
		System.out.println(s.length()); //to find length
		
		System.out.println("After Trim : ".concat(s.trim()));	
			
----------------------------------------------------------------------------------------------------------------------																								
 */			
		
		

/*			
---------------------------------------------------------------------------------------------------------------------		
			
//4. CharAt() ----Usage: Returns the character from string based on index
                  Use case in QA: Checking password complexity, extracting specific characters.
	              Index starts from 0
					
					
	String s= "welcome";		
	System.out.println(s.charAt(3));// c will return	
					
					
					
----------------------------------------------------------------------------------------------------------------------																								
*/			
		
	

		
/*			
---------------------------------------------------------------------------------------------------------------------		
					
//5. contains()-----Usage: Returns true if a string contains a specified sequence of characters.
                    *It is return boolean value---true/false
					Use case in QA: Checking if an API response contains a required value.

       String s= "welcome";
		
	   System.out.println(s.contains("wel")); // true
	   System.out.println(s.contains("welm")); // false
	   System.out.println(s.contains("Welm")); // false----case sensitive
		
							
							
----------------------------------------------------------------------------------------------------------------------																								
*/		
		

		
		
/*			
---------------------------------------------------------------------------------------------------------------------		
						
// 6. equals() and equalsIgnoreCase()------>Compare Strings
 
       
 Note-- * equalsIgnoreCase() is not case sensitive it will treat upper case or lower case as same.
        *equals() is case sensitive.
                                           
  	equals() → Checks if two strings are exactly the same (case-sensitive).
  	equalsIgnoreCase() → Ignores case differences while comparing.
  	
 Use case in QA: Validating expected vs. actual test results.	
 
		
		String s1= "welcome";
		String s2 = "welcome";
		
		
		System.out.println("Equal() case :--------");
		System.out.println(s1==s2);        // true
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals("welcome")); //true
		System.out.println(s1.equals("Welcome")); //false ----case sensitive
		
				
		System.out.println("equalsIgnoreCase() case :--------");
		
		System.out.println(s1==s2);        // true
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.equalsIgnoreCase("welcome")); //true
		System.out.println(s1.equalsIgnoreCase("Welcome")); //false ----case sensitive							
																	
----------------------------------------------------------------------------------------------------------------------																								
*/			
		
	
		
		
		
/*			
---------------------------------------------------------------------------------------------------------------------		
							
//7. replace() and replaceAll()----->
 
 
 * replace() → Replaces a specific character or word.
 * replaceAll() → Supports regular expressions for complex replacements.
  
  📌 Use case in QA: Masking sensitive data, replacing dynamic values in test cases.
  
  
        String s= "welcome to java selanium course selanium";
		
		System.out.println(s.replace('e', 'X'));                // replace character
		
		System.out.println(s.replace("selanium", "playwrite")); // replace word
  								
----------------------------------------------------------------------------------------------------------------------																								
*/		
		

		
		
/*			
---------------------------------------------------------------------------------------------------------------------		
							
//8. substring ()------>
 
 * Usage: Extracts a substring based on start and end indexes/Extracts substring from a main string.
  
 📌 Use case in QA: Extracting dynamic text from responses.
 
   Note-: when we count starting index value it starts from 0 index
          when we count ending index value it starts from +1 index
                
                0 1 2 3 4 5 6
				w e l c o m e 
                1 2 3 4 5 6 7
                
                									
        String s= "welcome";
		
		System.out.println(s.substring(1,3)); //el
		System.out.println(s.substring(0,3)); //wel         									
                																	
----------------------------------------------------------------------------------------------------------------------																								
*/			
		

		

		
/*			
---------------------------------------------------------------------------------------------------------------------		
									
//9. toUpperCase() and toLowerCase() – Convert Case   
     
 *toUpperCase() → Converts a string to uppercase.
 *toLowerCase() → Converts a string to lowercase.

	📌 Use case in QA: Normalizing data before comparison.		
	
			
		String s1= "welcome";
		String s2= "WELCOME";
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s2.toUpperCase());						
								                																	
----------------------------------------------------------------------------------------------------------------------																								
*/		


		
		
/*			
---------------------------------------------------------------------------------------------------------------------		
											
		//10. split() – Split a String into an Array
		
		 * Usage: Splits a string in multiple parts based on a delimiter and stores parts in an array.	
		  
		 📌 Use case in QA: Extracting values from API responses, logs, or CSV files.
		 
Note--> we can not use as a delimeters----- // * % ^ & ( )	 				
		 				
			
		String s = "abc@gmail.com";
		
		String a[]=s.split("@");
		
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println(Arrays.toString(a));
		
//	Ex 1--->
		
		String amount = "$15,20,34";  //exp 152034
		
		System.out.println(amount.replace("$", ""));
		
		System.out.println(amount.replace("$", "").replace(",", ""));
		
//		Ex 2--->	
		
		String st= "abc,123@xyz";   //exp---> abc  123  xyz
		
		 String arr1[]= st.split(",");
		 System.out.println(Arrays.toString(arr1)); //  [abc, 123@xyz]
		 
		 String arr2[]= arr1[1].split("@");
		 System.out.println(Arrays.toString(arr2)); //[123, xyz]
		 
		 System.out.println(arr1[0]);  //abc
		 System.out.println(arr2[0]);  //123 
		 System.out.println(arr2[1]);  //xyz
		 
		 
// Exp 3--->	 
		 		 
		 String s1= "abc 123";
		 
		 String ar[]= s1.split(" ");
		 
		 System.out.println(Arrays.toString(ar)); // [abc, 123]
		 
//Exp 4 --->		 
		 		 
		 String name= "John Kenedy";
		 System.out.println(name.contains("john")); // false
		 
		 System.out.println(name.replace('J','j').contains("john")); // true
		 
		 System.out.println(name.toLowerCase().contains("john")); // true							                																	
									                																	
----------------------------------------------------------------------------------------------------------------------																								
*/			
		
	
		
		
		 
		 
	}

}
