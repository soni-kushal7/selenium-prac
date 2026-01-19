package Day3;

public class Swapping_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    
		        int a = 10, b = 20;
		        
		        System.out.println("Before Swap: a = " + a + ", b = " + b);

		        // Swapping without a temporary variable
		        a = a + b;  // a becomes 30
		        b = a - b;  // b becomes 10 (original a)
		        a = a - b;  // a becomes 20 (original b)

		        System.out.println("After Swap: a = " + a + ", b = " + b);
		        
		        
		        
		        int x = 10, y = 20;

		        System.out.println("Before Swap: x = " + x + ", y = " + y);

		        // Swapping using a temporary variable
		        int temp = x;  // Store the value of 'x' in temp
		        x = y;         // Assign 'y' to 'x'
		        y = temp;      // Assign temp (original 'x') to 'y'

		        System.out.println("After Swap: x = " + x + ", y = " + y);
		        
		        
		        
		        
		   
		        
		        
		        
		        
		    }
		
	
	
	
	
	

}
