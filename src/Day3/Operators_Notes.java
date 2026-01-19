package Day3;

public class Operators_Notes {

	public static void main(String[] args) {
		/*
		 * 
		 * // 1. Arithmetic operators + - * / %
		 * 
		 * int a=100,b=15;
		 * 
		 * int result =a+b;
		 * 
		 * System.out.println("sum of a and b is :"+ result);
		 * System.out.println("sum of a and b is :"+(a+b));
		 * System.out.println("diff of a and b is :"+(a-b));
		 * System.out.println("multiplication of a and b is :"+(a*b));
		 * System.out.println("Division of a and b is :"+(a/b));
		 * System.out.println("Modolus of a and b is :"+(a%b));
		 * 
		 * 
		 * // 2. Relational/Comparison operators > >= < <= != == // return boolean
		 * values ---- true/false
		 * 
		 * System.out.println(a>b); // true System.out.println(a>=b); //true
		 * System.out.println(a<b); // false System.out.println(a<=b); // false
		 * System.out.println(a!=b); //true System.out.println(a==b); // false
		 * 
		 * // 3. Logical operators && || ! // return boolean values ----true/false //
		 * work between 2 boolean values
		 * 
		 * boolean x=true; boolean y=false;
		 * 
		 * System.out.println(x && y); // false System.out.println(x || y); // true
		 * System.out.println(!x); // false System.out.println(!y); //true
		 * 
		 * boolean b1= 10>20; System.out.println(b1); // false
		 * 
		 * boolean b2= 20>10; System.out.println(b2); //true
		 * 
		 * System.out.println(b1 && b2); //false System.out.println(b1 || b2); //true
		 * 
		 * System.out.println((10<20) && (20>10)); //true
		 * 
		 * 
		 * // 4.Increment & Decrement operators ++ --
		 * 
		 * // ++ is called Increment operator
		 * 
		 * // case 1
		 * 
		 * int k = 10; System.out.println(k);
		 * 
		 * k++; //k=k+1; System.out.println(k);
		 * 
		 * 
		 * //case 2
		 * 
		 * int d = 10; int res =k++; System.out.println(res); // 10------post increment
		 * 
		 * 
		 * //case 3
		 * 
		 * int e=10; int res1 = ++e; //11 ------pre-increment System.out.println(res1);
		 * 
		 */

		// -- is called Increment operator

		// case 1

		int f = 10;
		System.out.println(f);

		f--; // f=f-1;
		System.out.println(f);

		// case 2

		int g = 10;
		int rest = g--;
		System.out.println(rest); // 10------post-decrement

		// case 3

		int h = 10;
		int rest1 = --h; // 9------pre-decrement
		System.out.println(rest1);

		// 5. Assignment operators = += -= *= /= %=

		// case 1

		int i = 10;
		i += 5; // i=i+5;

		System.out.println(i);

		// case 2

		int j = 10;
		j *= 2; // j=j*2

		System.out.println(j);

		// 6. Conditional/ternary operators ?:

		// var=exp ? result 1 : result 2;

		// example 1

		int m = 200, n = 100;

		int p = (m < n) ? m : n;
		System.out.println(p);

		int q = (m > n) ? m : n;
		System.out.println(q);

		// Example 2

		int x = (1 == 1) ? 100 : 200;
		System.out.println(x);

		int y = (1 == 1) ? 200 : 100;
		System.out.println(y);

		// Example 3

		int person_age = 30;
		String res = (person_age >= 18) ? "Eligible" : "Not Eligible";
		System.out.println(res);

		int person_age1 = 15;
		String res1 = (person_age1 >= 18) ? "Eligible" : "Not Eligible";
		System.out.println(res1);

//Unary operators----only 1 variable is required.
		// (Increment & Decrement operators ++ --) (Assignment operators += -= *= /= %=
		// = !)

//Binary operator -----2 variables are required.			
		// (Arithmetic operators + - * / %) (Relational/Comparison operators > >= < <=
		// != ==)
		// (Logical operators && || ) except !

//ternary operator -----3 variables are required.
		// (Conditional/ternary operators ?:)

//Assignment 1 ---> Swapping of 2 numbers.
		
		
/*Diff between == and = 
		
		
		* = is the assignment operator
		
		*It is used to assign a value to a variable.
        Example: int x = 5; means the value 5 is stored in variable x.
        
 ==------------------>
       * == is the comparison operator

       * It is used to check if two values (or references) are equal.

       Example: if (x == 5) checks if x is equal to 5.
        
        

*/		
		
		

//				int a = 10,b=20;
//				a=a+b;
//				b=a-b;
//				
//				a=a-b;
//				
//				System.out.println(a+ " "+b);  

		String s = "AffCCA";

		char[] a = s.toCharArray();
		int count = 0;

		for (int c = 0; c < a.length; c++) {
			if (a[c] == a[a.length-1-c]) {

		
			} else {
				count = 1;
				break;
			}

		}
		if (count == 0) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not Palindrom");
		}

	}

}
