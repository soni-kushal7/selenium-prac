package Polymorphism;


// MothodOverloading--------

class Calculator{
	
	
	public static void add(int a, int b ){	
		
		System.out.println("Sum of a and b is :- " +(a+b));
		
	}
	
	
	public static void add(double x, double y) {
		
		System.out.println("Sum of x and y is :- "+ (x+y));
		
	}	
	
	public static void add(int a, int b, int c) {
		
		
		System.out.println("Sum of a b and c is :- "+ (a+b+c));
		
	}
	
	
}


public class MethodOverloading {

	public static void main(String[] args) {	
		
		Calculator.add(20, 30);
		Calculator.add(20.3, 34.5);	
		Calculator.add(30, 40, 70);
	

	}

}
