package JavaPrograms;

import java.util.Scanner;

public class JavaProgramsForInterview {

	public static void main(String[] args) {
		
		

// Swapping of 2 numbers without temp variable
		
		int a= 10;
		int b =20;
		System.out.println("Number before Swap : a = "+a+ ", b = "+b);
		
		a=a+b; // 30
		b=a-b; // 10
		a=a-b; // 20
		System.out.println("Number After Swap : a = "+a+ ", b = "+b);
		
		
//Swapping of 2 number with temp variable
		
		int x=10;
		int y=20;
		int temp=x;
		System.out.println("Number before Swap : x = "+x+ ", y = "+y);
		
		x=y;
		y=temp;
		System.out.println("Number After Swap : x = "+x+ ", y = "+y);
		
//Swapping 2 strings
		
		String s= "Kushal";
		String v= "Verma";
		String tem="Kushal";
		
		System.out.println("Number before Swap : s = "+s+ ", v = "+v);
		
		s=v;
		v=tem;
		System.out.println("Number before Swap : s = "+s+ ", v = "+v);
		
	//Class 4 
		
		//Problem 1: Write a program that checks whether a number is positive, negative, or zero.	
		
		
		// Scanner scanner = new Scanner(System.in);
		
	         // Prompt user to enter a number
	        // System.out.print("Enter a number: ");
	       //  double num = scanner.nextDouble();
		
		int num=18;
		if(num>0) {
			
			System.out.println("Positive Number");
		}
		else if(num <0) {
			System.out.println("Negative Number");
			
		}
		else{
			System.out.println("The number is zero");
			
		}
		
		//scanner.close();
		

//-----------------------------------------------------------------------
		
		//Problem 2: Write a program that checks if a number is even or odd using if-else.
		
		
		int p=9;
		
		if (p % 2==0) {
			
			System.out.println("Even Number");
		}
		else {
			
			System.out.println("Odd Number");
			
		}
		
		
//-----------------------------------------------------------------------------------		
		
		// Problem 3: Write a program to find the largest among three numbers using if-else.
		
		
		int q=100,w=200,e=30;
		
		if (q>w && q>e) {
			
			System.out.println("Q is greater");
		}
		else if(w>q && w>e) {
			
			System.out.println("W is greater");
		}
		else {
			System.out.println("E is greater");
		}
		
//-----------------------------------------------------------------------------------		
	
		
		//Problem 4: Write a program to check whether a given year is a leap year or not.
		

		
//--------------------------------------------------------------------------------
		
		//Problem 5: Write a program to check if a character is a vowel (a, e, i, o, u) or consonant.
		
		
		char chara = 'f';
		
		if (chara=='a' || chara =='e' || chara=='i' || chara == 'o' || chara=='u') {
			
			
			System.out.println("Vowel");
		}
		else {
			System.out.println("consonant");
			
		}
		
//-------------------------------------------------------------------------------
		
		
		//Problem 6: Write a program to check if a given number is divisible by both 5 and 11.
		
		
		int n=13;
		
		if (n % 5==0) {
			
			System.out.println("Number is divisible by 5");
		}
		else if(n% 11==0) {
			System.out.println("Number is divisible by 11");
		}
		else {
			System.out.println("Number is not divisible by 5 or 11");
		}
		
	
//-----------------------------------------------------------------------------
		
		//Problem 7: Given three sides of a triangle, check if it is valid or not.
		
		//if the sum of the lengths of any two sides is greater than the length of the third side
		
		
		int  s1 =4, s2=2 , s3=4;
		
		if (s1+s2>s3 && s2+s3>s1 && s3+s1>s2) {
			
			System.out.println("Triangle is valid");
			
		}
		else {
			
			System.out.println("Triangle is not valid");
		}
			
//-----------------------------------------------------------------------------
		
		//Problem 8: Write a program that checks if a person is eligible to vote.
		
		int vnum=13;
		
		if (vnum>=18) {
			System.out.println("eligible");
			
		}else {
			
			System.out.println("Not-eligible");
		}
		
		
//---------------------------------------------------------------------------
		
		//Problem 9: Given a student's marks, determine their grade based on the following conditions:
		
		 //90 - 100 → A
	      //80 - 89 → B
	      //70 - 79 → C
	      //60 - 69 → D
	     //Below 60 → Fail
		
		int grade =100;
		
		if (grade>=90 && grade<=100) {
			
			System.out.println("Grade A");
		}else if(grade>= 80 && grade <=89) {
			
			System.out.println("Grade B");
			
		}else if (grade >= 70 && grade<=79) {
			
			System.out.println("Grade C");
		}else if(grade >=60 && grade<=69) {
			System.out.println("Grade D");
		}else {
			System.out.println("Fail");
			
		}
			
//---------------------------------------------------------------
		
		//Problem 10: Write a program to calculate the electricity bill based on the following conditions:
		
		/* 
		 * Up to 100 units → ₹5 per unit
           101 - 200 units → ₹7 per unit
           Above 200 units → ₹10 per unit
		
		*/
		
		
		int elec_unit=67;
		
		if (elec_unit <=100) {
			
			System.out.println("Your total e-bill is : "+elec_unit* 5);
			
		}else if (elec_unit>=101 && elec_unit <= 200) {
			
			System.out.println("Your total e-bill is : "+elec_unit* 7);
		}else {
			
			System.out.println("Your total e-bill is : "+elec_unit* 10);
		}
		
//--------------------------------------------------------------------------
		
		//Problem 11: Write a program to check if a number is prime (only divisible by 1 and itself).
		
	
		
		
//---------------------------------------------------------------------------
		
// 12. reverse a number (% / = operators)
		
	    //*input---1234  output----4321 
		
		
		int Orgnlnum=1234;
		int rev=0;
		
		while(Orgnlnum !=0) {
			
			rev = rev *10 + Orgnlnum %10;
			
			Orgnlnum = Orgnlnum/10;
					
		}
		System.out.println(rev);
		
		
//----------------------------------------------------------------------------		
		
		  // 	 2.palindrome number (conditional statements + looping)
		 
		   //     *input---121  output----121
		
		
		int num7 =121;
		
		int orgnl_num= num7;
		
		int rev8 = 0;
		
		while (num7 !=0) {
			
			rev8 = rev8 * 10 + num7 % 10;
			num7 = num7/10;
			
		}
		if (orgnl_num == rev8) {
			
			System.out.println(orgnl_num + " Its a palindrome");
		}
		else {
			
			System.out.println(orgnl_num + " Its not a palindrome");
		}

		
		
		
		
		

	}

}
