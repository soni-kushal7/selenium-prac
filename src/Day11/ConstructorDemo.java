package Day11;



public class ConstructorDemo {
	
	int x,y;
	
	ConstructorDemo()    //Default Constructor
	{
		x=100;
		y=200;
		
	}	
	
	ConstructorDemo(int a, int b)    // parameterized constructor
	{
		x=a;
		y=b;
		
	} 
	
	void sum()                      //sum Method
	{
		System.out.println(x+y);
		
	}
	

	public static void main(String[] args) {
		
//Now we have to create object of ConstructorDemo class.
		
		//ConstructorDemo cd= new ConstructorDemo(); // It will invoke default constructor.
		
		ConstructorDemo cd = new ConstructorDemo(25,67); // Parameterized constructor.
		
		cd.sum();
		
		
		
		
	}

}
