package Day9;

public class ReverseAString {

	public static void main(String[] args) {
		
		
/*		
-----------------------------------------------------------------------------------------------------------------------		
//Approach 1---- length() and CharAt()
		
		String s = "welcome";
		
		String rev="";
		
		for (int i=s.length()-1;i>=0;i--) {
			
			 rev = rev + s.charAt(i);
			
			
		}
		
		System.out.println("Reversed String is : ".concat(rev));
		
----------------------------------------------------------------------------------------------------------------------	
*/		
		

		
/*	
-----------------------------------------------------------------------------------------------------------------------  	
//Approach 2----without using string methods (by converting string to char array type)
		
//toCharArray method will convert string into array format and this will return character type of an array
		
		String s = "welcome";
		
		String rev= "";
		
		char a[] = s.toCharArray();
		
		
		for(int i=a.length-1;i>=0; i--) {  
			
			rev=rev + a[i];
			
		}
		   System.out.println(rev);
		   
---------------------------------------------------------------------------------------------------------------------		   
*/		
		

		
		
/*		
-----------------------------------------------------------------------------------------------------------------------		
//Approach 3-----using StringBuffer class
  
  
 Note- StringBuffer and StringBuilder are classes like String
  
  Syntax to create StringBuffer and StringBuilder class 
  
  StringBuffer s= new StringBuffer ("welcome");
  
  StringBulder s= new StringBulder ("welcome");

StringBuffer s1= new StringBuffer ("welcome");
	
	System.out.println("Reversed string is : "+ s1.reverse());

  
				
----------------------------------------------------------------------------------------------------------------------	
*/			
		
		
		   
/*		
-----------------------------------------------------------------------------------------------------------------------		
//Approach 4-----using StringBuilder class
		  
    StringBuilder s= new StringBuilder("welcome");
		
	System.out.println("Reversed string is : "+ s.reverse());
		 

		  
						
----------------------------------------------------------------------------------------------------------------------	
*/		
		  
	
// To reverse a string---- the reverse method is not present in string class this method is only present in 
// StringBuffer and StringBuilder class
		
		
		
		
		   
		
		
		
		
		
		
		

	}

}
