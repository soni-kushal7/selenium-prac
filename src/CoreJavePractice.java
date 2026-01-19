
public class CoreJavePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//	int myNum = 11;	
//	String name = "kushal";
//	char letter = 'k';
//	double decimal = 7.11;
//	boolean mycard = true;
//	
//	System.out.println(myNum + " is a number");
//	
//	System.out.println("My name is " + name);
//	
//	System.out.println("This is a single letter--> " + letter);
//	
//	System.out.println("This is decimal value--> " + decimal);
//	
//	System.out.println("Used for True/False--> " + mycard );
//	
	
//	Array-----
		
//		1.Arrays store multiple values in a single variable.
//		2.Indexing starts from 0 (first element is at index 0).
//		3.Array Size is fixed at the time of creation (new int[4] means it can store 4 values).
//		4.Looping is used to access each element and print it.
		
		// Step 1: Declare and Create an Array of Size 4
		
//		1st method----For Integer value
	
//		int[] arr = new int [4];
		
		// Step 2: Assign Values to Each Index of the Array
		
//		arr[0] = 11;
//		arr[1] =0;
//		arr[2] =7;
//		arr[3] =1994;
		
		// Step 3: Use a Loop to Print All Elements of the Array
		
//            for(int i=0;i<arr.length; i++) { 
//			
////         --(arr.length → Returns the length of the array (which is 4).)
//            	
//			System.out.println(arr[i]);// Print each element
//			
//		}
		
		
//    		2nd method
            
//            int [] arr2 = {1,3,5,6,7,8,9};
//            
//            for (int i=0;i<arr2.length; i++) {
//            	
//            	System.out.println(arr2[i]);
//            	
//            }
//            
            
//        For String value
            
//            String [] name = {"kushal", "Verma"};
//            
//            for (int i=0;i<name.length;i++) {
//            	
//            	System.out.println(name[i]);
//            	
//            }
            
            
         // Using a foreach loop to print array elements
            
//            String [] name1 = {"kushal", "Verma"};
//            
//            for(String s : name1) {
//                System.out.println(s);
//            }   
            
//		To find Even number.
		
//				int[] even= {1,2,3,4,5,6,7,8,9,10};
//				
//				for (int i=0; i< even.length; i++) {
//					
//					if (even[i] % 2==0)
//					{
//						
//					System.out.println(even[i] + " is a even number.");
//					
//					}
//					else	
//					{
//						System.out.println(even[i] + " is not a even number.");
//					}
//					
//				}
		
//		To check if given array has multiple of 2.
		
//		int[] multipleof2= {1,2,3,4,5,6,7,8,9,10};
//		
//		for (int i=0; i< multipleof2.length; i++) {
//		
//		if (multipleof2[i] % 2==0)
//			{
//				
//			System.out.println(multipleof2[i] + " is a multiple of 2.");
//			
//			break;
//			
//			}
//			else	
//			{
//				System.out.println(multipleof2[i] + " is not a multiple of 2.");
//			}
//			
//		}
//		
		
		 int[] numbers = {1,2,3,4,5};
		    
//		 int firstElement = numbers[0]; 
//		 int lastElement = numbers[4];
//		 
//		 System.out.println(firstElement);
//		 System.out.println(lastElement);
		 
		 for(int i=numbers.length-1;i>=0; i--) {
			 
			 System.out.println(numbers[i]);
		 }
		 
		
	
		

	}

}
