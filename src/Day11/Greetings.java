package Day11;

public class Greetings {
	
	
// In this class we are going to create variables and methods only.
// and to access these variables and methods we create another main class and call these methods throw object.
	
	

	
//Create method-->
	
//----------------------------------------------------------------------------------------------------------  	
	
//	1. No parameter     No return Value 	
	
	
     void m1()
   {
	 System.out.println("Hello Kushal....."); 
	 
   }	
     
     
 //----------------------------------------------------------------------------------------------------------       
	
//  2. No parameter     return Value 	
     
 //type of the variable is String 
     
     String m2()
     {
    	 
    	 return "Hello how are you??";  
     }
     
	
// type of the variable is int	
     
    int m3() {
    	
    	return 2*9;
    } 
 
    
//----------------------------------------------------------------------------------------------------------    
  
// 3.Takes parameter	No return Value     
    
  
   void m4(String name) 
   {
	   System.out.println("Hello" + name);
	   
   }
    
      
    
 //----------------------------------------------------------------------------------------------------------     
    
 //4.Takes parameter   return Value 
   
   
   String m5(String name)         //here string is a return type
   {
	  return ("How are you " + name);   
	   
   }
   

   
 //----------------------------------------------------------------------------------------------------------  
   
   
   

}
