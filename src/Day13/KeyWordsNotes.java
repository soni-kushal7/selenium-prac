package Day13;

public class KeyWordsNotes {

	public static void main(String[] args) {
		
/*
 
 This keyword---> this keyword represent class/object
 
  		
 2 types of variables--->
 
 1.class variables/instance variables
 2.local variables
  		
  		
 Static Keyword---->static keyword can be applied for variables and methods.
 
 1.static variable
 2.static method
 3.non-static variable
 4.non-static method
 		
 1.Static methods can access static variables and static methods directly (without object)
      Note:- Main is a static method so it can access static variables and static methods directly 
 		
 2.Static methods can access non-static variables and non-static methods through objects.	
 		
 3.Non-Static methods can access everything directly.		
 		
 		
 		
 
  		
  		
   class test() 
                {
                   static String s = "kushal";
                
                } 
   
            test.s.length();
   
   
				class system 
				{
					static PrintStream out;
				}

				System.out.println();
							
				
			
				
* system is a pre-difine class in java,out is a static variable and println(); is a method 
  which is belongs to PrintStream Class which is already there in java.
				
					
Note:- Explanation of "public static void main(String[] args) {}"


public--> public is an access modifyer 

static---> Static is a keyword which means JVM directly call that main method without creating any object.

void---> void means, there is no return value for main method.

(String[] args)---> (String[] args) is nothing but a string array it will take as a parameter and arg is just
                    a variable we can write xyx also 		
  		
  		
  		
 1. public static void main(String[] args)  ----->valid this is the method JVM Look for
  {
  
  }		
  	
2.   static public void main(String[] args) ----->valid
  {
  
  }			
  
 3.   static void public main(String[] args) ----->invalid
  {
         invalid because the return type is always in front of main method.
  }	 		
  		
 4.   void main(String[] args) public static----->invalid
  {
         invalid because after closing this parameter brackets--(String[] args) method we should not write anything
  }	 
  
  5. public static void main(int a[] )----->valid --this is just like a normal method
  {
       JVM is not recognized,because this is a valid method but not actual method which we are looking
  }	 
  		
  	
  		
  		
 
  		
  		
  		
 */
		

		
		
		
		
		

	}

}
