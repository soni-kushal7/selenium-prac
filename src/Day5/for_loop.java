package Day5;

public class for_loop {

	public static void main(String[] args) {
		
		
/*

      Syntax of for loop

for(initilization ; condition ; inc/dec)
   {
   statements;

   }

*/
		
	/*	
		
		Which loop is prefered to use 
		.........................................
		
		* if you know the number of iterations in advance, the for loop is often the most suitable
		* if you want to execute the loop at least once, the do-while loop is appropriate.
		* if u are uncertain about the number of iteration and the loop termination is based on a condition,
		 the while loop is good choice.
		
		
	*/	
		
		// Jumping statements-----
		
		//break and continue
		
		
//		for (int i=1;i<=10;i++) {
//			
//			
//			if (i==7) {
//				
//				break;
//			}
//			System.out.println(i);
//			
//		}
		
//          for (int i=1;i<=10;i++) {
//			
//			
//			if (i==3 || i==5 || i==9) {
//				
//				continue;
//			}
//			System.out.println(i);
//			
//		}
		
		
/*
	 
	   Control statements
	   ------------------------------------
	   1. conditional statements------if , if-else, nested ifelse, switchcase
	   2.looping statements/ iterative statements----while, do whine, for
	   3.jumping statements----break, continue
	   
 */
		
		
		int a=20;
		int b=30;
		
		int largest = (a > b) ? a : b;
		System.out.println("The largest number is: " + largest);
		
		
		
	}
	
	

}
