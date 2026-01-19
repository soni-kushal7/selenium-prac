package Day13;

public class ThisKeyword {
	
	
	int x,y;    // Class variables-->we can use class variable from any anywhere within the class
	
	
/*	
	
	ThisKeyword(int a, int b)   // A local variable in Java is a variable that is declared inside a method, 
	                            //constructor, or block, and can be used only within that scope.
	{
		x=a;
		y=b;
		
	}
	
*/	
	
/*	
	
	ThisKeyword(int x, int y)
	{
		//x=x;
		//y=y;                     //it will return 0 as default value, if we add this keyword before x & y then 
		                         
		
		this.x=x;              // now it knows which one is class variable and which one is local variable.
		this.y=y;              // output -->200 , 300
	}
	
*/	
	
	void setData(int x,int y) 
	{
		//x=a;
		//y=b;
		
		this.x=x;
		this.y=y;
		
	}
	
	
	void display()
	{
		System.out.println(x + " "  + y );
		
	}
	

	public static void main(String[] args) {
		
		//ThisKeyword th = new ThisKeyword(200,300);
		//th.display();
		
		ThisKeyword th = new ThisKeyword();
		
		th.setData(231, 321);
		th.display();
		
		

	}

}
