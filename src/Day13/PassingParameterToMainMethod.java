package Day13;

public class PassingParameterToMainMethod {

	public static void main(String[] args) {
		
		
		
//Q. How to pass parameters to main method
		
		
		//System.out.println(args.length); //It will return 0
		
// 		*write click on your mouse
//		*click on run as
//		*click on run configuration
//		*Click on arguments
//		*Enter arguments
//		* Click on run button
		

		System.out.println(args.length); 	//Now it will return length as 5
		
// Now if we want to print the values also, then use for enhanced loop 
		
		for(String value:args)
		{
			System.out.println(value);
			
		}
		
		
		
	}

}
