package Day2;

public class Data_Type_Notes {

	public static void main(String[] args) {
		
		
		//Data Type Represent Type of Data
		
		//Primitive data types
		
		
		// byte, short, int , long---->to represent number without decimal
		int a=2341,b=3212,c=63424;
		System.out.println(a+" "+b+" "+c);
		
		byte by= 100;
        System.out.println(by);
		
		short sh= 24428;
		System.out.println(sh);
		
		long l = 123456789L;   //Literal is needed 
		System.out.println(l);
		
		//decimal number -----To represent decimal number
		
		float ft = 1.6F;        //Literal is needed 
		System.out.println(ft);
		
		double db= 1.34;
		System.out.println(db);
		
		
		// To represent single char (Single Quote)
		char grade ='A';
		System.out.println(grade);
		
		//To store True/False
		boolean bln = true;
		System.out.println(bln);
		
		//Non primitive data type
		
		// string, ArrayList, HashMap, HashSat etc
		
		String s= "kushal";
		System.out.println(s);
		
		
/*
 Java is statically typed programming language
 
 
 int x=100;
 x=200;--------It is allowed
 
 int x=100;
 x="Testing"; ------Not allowed in java because we cannot change the datatype, we can only change tha value
 
 
 
 python is dynamically typed programming language
 
 In python we are not going to specify any data type, in python data types are already there
  	
 x=100;
 x="Testing";	--------Allowed	
  		
  	Note: in Python data type is automatically assigned to the variable	
  		
  		
 */
		
		
		
		
	}

}
