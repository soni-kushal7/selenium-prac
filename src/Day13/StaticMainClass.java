package Day13;

public class StaticMainClass {

	public static void main(String[] args) {
		

//when we have main method in a same class we can directly access even class name is nor required.
// if we trying to access in another main class we have to specify the "className.Variable"
						
		
				System.out.println(StaticKeyword.a);
				StaticKeyword.m1();
				
/*				
				
//Note:-
   
   
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
							
				
*/				
				
// system is a pre-difine class in java,out is a static variable and println(); is a method 
				//which is blongs to PrintStream Class which is already there in java.
				
				
/*	
 
 			
Note:- Explaination of "public static void main(String[] args) {}"


public--> public is an access modifyer 

static---> Static is a keyword which means JVM directly call that main method without creating any object.

void---> void means, there is no return value for main method.

(String[] args)---> (String[] args) is nothing but a string array it will take as a parameter and arg is just
                    a variable we can write xyx also










				
				
*/				

	}

}
