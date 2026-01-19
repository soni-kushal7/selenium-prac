package Day9;

public class StringComparision {

	public static void main(String[] args) {
		
/*
 	
 		Q.1- Difference between == and equals()
 		Q2.-Difference between--
 		
               String s = "welcome";
               String s = new String ("welcome");
               
               

Ans.1- In Java, both == and equals() are used for comparison	


     == ---->
	
	*Checks if two objects are stored in the same memory location (i.e., if they are the same object).
	*Used for primitive data types and object references.
	
	
	✅ Example (Using == with Primitive Data Types)


public class ComparisonExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        
        System.out.println(a == b); // Output: true (Values are the same)
    }
}

✅ Works correctly because int values are compared directly.



✅ Example (Using == with Objects)
java
Copy
Edit
public class StringComparison {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        
        System.out.println(s1 == s2); // Output: false
    }
}

🔹 Why false?

Even though s1 and s2 have the same value, they are stored in different memory locations.

== only checks if they refer to the same object, not if the content is the same.


equals()----->(Content Comparison)


*Used to compare the actual content (values) of two objects.
*The default equals() method in Object works like ==, but many classes override it to compare values instead of references.


✅ Example (Using equals() for Correct String Comparison)


public class EqualsExample {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        
        System.out.println(s1.equals(s2)); // Output: true
    }
}

🔹 Why true?

equals() compares the actual content of the objects, not their memory locations.

Since "Hello" is the same in both s1 and s2, it returns true.
	
	
	
	
🔹 When to Use What?


Use Case	                                                               Best Choice
                                                              
✅ Comparing primitive data types (int, char, double)	                   ==
✅ Checking if two object references point to the same memory	           ==
✅ Comparing actual content of objects (String, ArrayList, Objects)	       equals()
	
	
	
🔥 Final Takeaway

=> Use == for primitive types (int, char, boolean) and checking if two objects are the same in memory.

=> Use equals() to compare the content of objects like String, Integer, List, etc.	
	
	
----------------Examples--------------------------------

		
		//Case-1
		
		String s1 = "welcome"; 
		String s2 = "welcome";
		
		System.out.println(s1==s2);           //True ----(in this s1 and s2 are same object)
		System.out.println(s1.equals(s2));    //True
		
		
		
		//Case-2
		 
		String s3 = new String ("welcome");
		String s4 = new String ("welcome");
		
		System.out.println(s3);  //welcome
		System.out.println(s4);  //welcome
		
		System.out.println(s3==s4);        //False --to compare the object (in this s3 and s4 are different object)
		System.out.println(s3.equals(s4)); //True----to compare the values of object
		
		
		//Case-3
		
		String s5= "abc";
		String s6= new String ("abc");
		
		System.out.println(s5==s6);           //False --to compare the object (in this s3 and s4 are different object)
		System.out.println(s5.equals(s6));    //True----to compare the values of object
		
		
		//Case-4
		
		String s1 = "abc";
		String s2= new String ("abc");
		
		String s3= s2;
		
		System.out.println(s1==s2);          //false
		System.out.println(s1.equals(s2));   //true
		
		System.out.println(s2==s3);    //true because objects are equal/same		
		System.out.println(s2.equals(s3));  //true
		
		
		System.out.println(s1==s3); //false
		System.out.println(s1.equals(s3)); //true
			
 		
 */

		
		
		
	
		

	}

}
