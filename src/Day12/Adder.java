package Day12;

public class Adder {

	
	int a=10, b = 30;
	
	void sum()
	{
		System.out.println(a+b);  // 1 no parameters
		
	}	
	
	
	void sum(int x,int y)
	{
		System.out.println(x+y);  // 2-- with two parameters
		
	}	
	
	void sum(int x,double y)
	{
		System.out.println(x+y);  // 3-- data type of parameters is different.
		
	}
	
	void sum(double x,int y) 
	{
		System.out.println(x+y);  // 4-- Order of parameter is different.
		
	}
	
	void sum(int x,int y,int z) 
	{
		
		System.out.println(x+y+z); // Number of parameter is different.
	}
	
	
}
