package Day12;

public class OverloadingMainMethod {
	
	void main(int x) 
	{
		System.out.println(x);   //Method 1		
		
	}
	
	void main(String s) 
	{
		System.out.println(s);   //Method 2
		
	}
	
	void main(String s1, String s2) 
	{
		System.out.println(s1+s2);  //Method 3
		
	}
	
//Execution starts from Main method. 
	
	public static void main(String[] args) {
		
		
		OverloadingMainMethod ov= new OverloadingMainMethod();
		
		ov.main(106);
		ov.main("Kushal Verma");
		ov.main("How r u ! ", "Kushal");
		

	}

}
