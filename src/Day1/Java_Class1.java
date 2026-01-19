package Day1;

public class Java_Class1 {

	public static void main(String[] args) { //Main method of this class 
		
		//System.out.println("Welcome in java class Kushal ");
		//int a= 6;
		//System.out.println(10+30);
		
		
		A obj = new A(); //Create the object of class A
		B obj1 = new B();//Create the object of class B
		
		System.out.println("sum is "+ obj.sum(2,4)); // Calling the function sum of class A
		System.out.println("Subtract "+ obj.subtract(10, 4)); // Calling the function Subtract of class A
		System.out.println(obj1.mult(2, 6) + " Is a multiple"); // Calling the function mult of class B
		System.out.println(obj1.MyName("Kushal is a good boy"));
	

	}
	}


	 class A{
		public int sum(int a ,int b) {
			return a+b;
	}
		public int subtract(int a ,int b) {
			return a-b;
	}
		
		
	}
	 
	 
	 class B{
		 public int mult(int a, int b) {
			 return a*b;
		 }
		 
		 public String MyName(String a) {
			 return a;
			 
		 }
		 
	 }

