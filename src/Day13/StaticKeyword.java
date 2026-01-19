package Day13;

public class StaticKeyword {
	
	
 static	int a=10;   // static variable
 
        int b=20;   // Non-static variable 
 
	static void m1() //Static method
	{
		System.out.println("this is m1 static method....");
		
	}
	
	void m2()   //Non-ststic method
	{
		
		System.out.println("this is m2 static method...");
	}
	
//3.Non-Static methods can access everything directly.	
	
	void m3() 
	{
		System.out.println(a);  // everything we can access directly from non-static method 
		                      //but we can not access directly from static method we have to access through object only. 
		System.out.println(b);
		m1();
		m2();
		
	}
	
	

	public static void main(String[] args) {
		
//1.Static methods can access static variables and static methods directly (without object)	
		
		//System.out.println(a);
		//m1();
		
		
// If we access non-ststic variable or methods from ststic main method then it will through an error. 
		
		//System.out.println(b); // can not access, b is non static. error :- Cannot make a static reference to the non-static field b
		//m2();    //error :- Cannot make a static reference to the non-static method m2() from the type StaticKeyword
		

// 2.Static methods can access non-static variables and non-static methods through objects.
		
		//StaticKeyword sk = new StaticKeyword();
		
		//System.out.println(sk.b);
		//sk.m2();
		
//3.Non-Static methods can access everything directly.	
		
		
		StaticKeyword sk = new StaticKeyword();
		sk.m3(); // we need to create object to access method 
		
		
		
		
		
		
		
		
		
	}

}
