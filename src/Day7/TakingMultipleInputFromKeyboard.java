package Day7;

import java.util.Scanner;

public class TakingMultipleInputFromKeyboard {

	public static void main(String[] args) {
		
// Integer-----------------------------------------
		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("Enter first number : ");
//		int num1=sc.nextInt();
//		
//		System.out.println("Enter second number : ");
//		int num2= sc.nextInt();	
//		
//		System.out.println("Adition of two numbers are : " + (num1+num2));
		
		
	
//String-------------------------------------------------
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first name : ");
	    String name1=sc.next();
	    
	    System.out.println("Enter Last name : ");
	    String name2=sc.next();
	    
	    
	    System.out.println("Your Full Name Is : " +  name1 +" "+ name2 );
	    
		System.out.println("Enter unknown value : ");
		Object value = sc.next();  
		System.out.println(value);

	}

}
