package Day4;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Loop_class {

	public static void main(String[] args) {
		
		
/*
 
 Control statements----------------------------------->
 
 1.Conditional statements
 2.Looping/Iterative Statements.
 3.Jumping Statements
 
 -----------------------------------------------------
 
 
 1. Conditional Statements----------------->
 
 if
 if else
 nested if else
 switch case
 
 
 If Syntax-->
 
 if(Condition)
 {
 statements;
 }
 
 		
 */
		int persons_age=25;
		
		if (persons_age>=18) 
		{
			System.out.println("Eligeble for vote");
			
		}
		else
		{
			System.out.println("Not Eligeble for vote");
		}
		
		
		
		
//		int x=10,y=20;
//		
//		if(x>y) {
//			
//			System.out.println("X is smaller");
//		}
//		
//		else if (y>x) {
//			System.out.println("Y is greater");
//			
//		}
		
		
//		int x=10,y=-5,z=0;
//		
//		if (x>=1) {
//			
//			System.out.println("Positive number");
//			
//		}
//		
//		else if (y<0) {
//			
//			System.out.println("Negative Number");
//			
//		}
//		
//		else if (z==0) {
//			
//			System.out.println("zero");
//		}
		
		//.....................................................
		
		
		
		//Problem 1: Write a program that checks whether a number is positive, negative, or zero.
		
		
//		// Create a Scanner object for user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt user to enter a number
//        System.out.print("Enter a number: ");
//        double number = scanner.nextDouble();
//
//        // Check if the number is positive, negative, or zero
//        if (number > 0) {
//            System.out.println("The number is Positive.");
//        } else if (number < 0) {
//            System.out.println("The number is Negative.");
//        } else {
//            System.out.println("The number is Zero.");
//        }
//		
//	
//		
//     // Close the scanner
//        scanner.close();
		
		
		
		//Problem 2: Write a program that checks if a number is even or odd using if-else.
		
		
//		int num=18;
//		
//		if (num % 2 ==0) {
//			
//			System.out.println("Number is Even");
//		}
//		
//		else {
//			
//			System.out.println("Number is Odd");
//		}
		
		
		// Problem 3: Write a program to find the largest among three numbers using if-else.
		
		
//		int x=100,y=200,z=300;
//		
//		if (x>y && x>z) {
//			
//			System.out.println("X is greater");
//			
//		}
//		
//		else if (y>x && y>z){
//			
//			System.out.println("y is greater");
//		}
//			
//		else {
//			
//			System.out.println("z is greater");
//		}	
//		
		
		//Problem 4: Write a program to check whether a given year is a leap year or not.
		
		
		
		//Problem 5: Write a program to check if a character is a vowel (a, e, i, o, u) or consonant.
		
//		char character= 'i';
//		
//		if (character=='a' || character=='e' || character=='i' || character=='o' || character=='u') {
//			
//			System.out.println("This character is a Vowel");
//			
//		}
//		
//		else {
//			
//			System.out.println("This character is a Consonant");
//		}
		
		
		//Problem 6: Write a program to check if a given number is divisible by both 5 and 11.
		
		
//		int num=122;
//		
//		if (num % 5==0) {
//			
//			System.out.println("Number is divisible by both 5");
//			
//		}
//		else if (num % 11==0) {
//			
//			System.out.println("Number is divisible by both 11");
//		}
//		
//		else {
//			
//			System.out.println("Number is not divisible by 5 or 11 both");
//		}

		
		//Problem 7: Given three sides of a triangle, check if it is valid or not.
	/*	

		int  s1 =4, s2=2 , s3=4;
		
		if (s1+s2>s3 && s2+s3>s1 && s3+s1>s2) {
			
			System.out.println("Triangle is valid");
			
		}
		else {
			
			System.out.println("Triangle is not valid");
		}
		
	*/	
		
		//Problem 8: Write a program that checks if a person is eligible to vote.
		
		
//		int age=18;
//		
//		if (age>=18) {
//			
//			System.out.println("Elegible for Vote");
//		}
//		else {
//			System.out.println("Not-Elegible for Vote");
//		}
		
		
		//Problem 9: Given a student's marks, determine their grade based on the following conditions:

       //90 - 100 → A
       //80 - 89 → B
      //70 - 79 → C
      //60 - 69 → D
     //Below 60 → Fail

		
//		int grade =12 ;
//		
//		if (grade>=90 && grade<=100 ) {
//			
//			System.out.println("Grade A");
//		}
//		
//		else if (grade>=80 && grade<=89) {
//			
//			System.out.println("Grade B");
//		}
//		
//		else if (grade>=70 && grade<=79) {
//			System.out.println("Grade C");
//		}
//		
//		else if (grade>=60 && grade<=69) {
//			System.out.println("Grade D");
//		}
//		else {
//			System.out.println("Fail!!");
//		}
		
		
		//Problem 10: Write a program to calculate the electricity bill based on the following conditions:
		
		
		/* 
		 * Up to 100 units → ₹5 per unit
           101 - 200 units → ₹7 per unit
           Above 200 units → ₹10 per unit
		
		*/
		
//		int units=201;
//		
//		if (units<=100) {
//			
//			System.out.println("Bill Amount: "+ units*5 );
//		}
//		
//		else if (units >=101 && units<=200) {
//			System.out.println("Bill Amount: "+ units*7 );
//			
//		}
//		else {
//			
//			System.out.println("Bill Amount: "+ units*10 );
//		}
		
		
		//Problem 11: Write a program to check if a number is prime (only divisible by 1 and itself).
			
//		int num=12; wrong logic
//		
//		if (num % 2==0 && num % 1==0) {
//			
//			System.out.println("Prime Number" );
//		}
//		
//		else {
//			
//			System.out.println("Not a Prime Number" );
//		}
		
		
		//Problem 12: Write a program to check if a number reads the same forward and backward.
		
		int a=123;
		
		// Switch case ----display week name based on week number
		
		/*
		Syntex 
		switch (variable)
		{
		case value 1: statements;
		case value 2: statements;
		case value 3: statements;
		default : statements;
		}
		*/
		
/*
	int weekno=4;
		
		switch (weekno) {
		
		case 1 : System.out.println("Sunday"); break;
		case 2 : System.out.println("Monday"); break;
		case 3 : System.out.println("Tuesday"); break;
		case 4 : System.out.println("Wednesday"); break;
		case 5 : System.out.println("Thrusday"); break;
		case 6 : System.out.println("Friday"); break;
		case 7 : System.out.println("Saturday"); break;
		default :System.out.println("Invalid week number");
		
		}
*/		
		
		// 1. Smallest of 3 number.
		// 2.print Week number based on week name
	
		
/*		
		
		int x=2,y=2,z=2;
		
		
		if (x<y && x<z) {
			
			System.out.println("X is smallest number");
		}
		
		else if (y<x && y<z) {
			
			System.out.println("Y is smallest number");
		}
		
		else if (z<x && z<y) {
			System.out.println("Z is smallest number");
		}
		else {
			System.out.println("Invalid number");
		}

*/	

/*		
		
		String s = "Tuesday";
		
		if (s=="Sunday") {
			
			System.out.println("Week Number is 1");
		}
		else if (s=="Monday") {
			
			System.out.println("Week Number is 2");
		}
		
		else if (s=="Tuesday") {
			
			System.out.println("Week Number is 3");
		}
        else if (s=="Wednesday") {
			
			System.out.println("Week Number is 4");
		}
         else if (s=="Thrusday") {
			
			System.out.println("Week Number is 5");
		}
         else if (s=="Friday") {
 			
 			System.out.println("Week Number is 6");
 		}
         else if (s=="Saturday") {
  			
  			System.out.println("Week Number is 7");
  		}
         else {
        	 System.out.println("Invalid week day");
         }
	*/	
		
		
//        String s ="Thrusday";
//		
//		switch (s) {
//		
//		case "Sunday"   : System.out.println(1); break;
//		case "Monday"   : System.out.println(2); break;
//		case "Tuesday"  : System.out.println(3); break;
//		case "Wednesday": System.out.println(4); break;
//		case "Thrusday" : System.out.println(5); break;
//		case "Friday"   : System.out.println(6); break;
//		case "Saturday" : System.out.println(7); break;
//		default :System.out.println("Invalid week Name");
//		
//		}
		
		
		
		
		
	}

}
