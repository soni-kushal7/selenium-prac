package Day5;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
	
		/*
		
		 1. reverse a number (% / = operators)
		
		     *input---1234  output----4321
		 
		 2.palindrome number (conditional statements + looping)
		 
             *input---121  output----121
            	 
		 3. Count number of digits in a number
		 
		   input----123456 output----6 (looping)
		   
		 4. Count number of even and odd digits in a number
		 
		   input-----23456 output---3 even 2 odd
		   
		 5. Find sum of digits in a number
		 
		   input ----1234 output----10
		 
		 
		 */
		
		
		
		// 1. reverse a number (% / = operators)
		
	    //*input---1234  output----4321
		
		
//		Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a number: ");
         
//        int num = sc.nextInt();  // Input a number
//        
//        //int num1=1234;
//        
//        int rev=0;   // Make temp variable
//        
//        while (num !=0) {
//        	
//        	rev = rev*10 + num % 10; //Append digit to reversed number + Get last digit of a number 
//        	num = num/10;            //Remove last digit
//        	
//        }
//         System.out.println("Reverse number is : "+ rev);
        
        
//        int num=1234,rev=0;
//        
//        while (num !=0) {
//        	
//        	rev = rev *10 + num % 10;  // 1.rev*10=0 + 1234 %10 = 4 ==> 4  2. 4 *10 + 123 % 10 ==> 40+3==>43 
//        	num = num / 10;      // 1.1234/10==> 123   2. 123/10 ==>12          
//        	
//        }
//        
//        System.out.println("Reverse number is : "+ rev);
         
         
  // 	 2.palindrome number (conditional statements + looping)
	 
   //     *input---121  output----121
         

//        Scanner sc1 = new Scanner (System.in);
//        
//        System.out.println("Enter a number : ");
//        
//        int num = sc1.nextInt();
//        
//        int orignal_number= num;
//        
//       int rev=0;
//        
//        while (num !=0)
//        {
//        	
//        	rev= rev *10 + num % 10;
		
//        	num = num /10; 
//        }	
//        	if (orignal_number== rev) {
//        		
//        		System.out.println(orignal_number + " Is a Palindrome Number: ");
//        		
//        	}
//        	else {
//        		
//        		System.out.println(orignal_number + " Is not a Palindrome Number: ");
//        	}
        	
        

        	
  //  -------------------------------------    	
        

//      Scanner sc1 = new Scanner (System.in);
//      
//      System.out.println("Enter a number : ");
//      
//      int num = sc1.nextInt();
//      
//      int orignal_number= num;
//      int sum = 0;
//      
//      int n = String.valueOf(num).length(); // Count digits
//      
//      
//      while (num>0)
//      {
//      	
//    	  int digit = num % 10;  // Extract last digit
//          sum += Math.pow(digit, n); // Add (digit^n) to sum
//          num /= 10; // Remove last digit
//      	
//      }	
//      	if (sum == orignal_number) {
//      		
//      		System.out.println(orignal_number + " is an Armstrong number. ");
//      		
//      	}
//      	else {
//      		
//      		System.out.println(orignal_number + " is not an Armstrong number. ");
//      	}
//      	
        
        // 3. Count number of digits in a number
		 
		 //  input----123456 output----6 (looping)
		
//		int num=1234569;
//		
//		int count=0;
//		
//		while (num>0) {
//			
//			num = num/10;
//			count++;
//			
//		}
//		    System.out.println("Count of a number is "+ count);
        
        
		
		
	//	4. Count number of even and odd digits in a number
		 
	//	   input-----23456 output---3 even 2 odd
		
//			int num=1234567;
//			
//			int even_count=0;
//			int odd_count=0;
//				
//				while(num>0) {
//					
//					int rem = num %10;
//					
//					if (rem %2==0) {
//						
//						even_count++;
//					}
//					else {
//						odd_count++;
//					}
//					
//					num=num/10;
//				}
//				System.out.println("Number of even number "+ even_count);
//				System.out.println("Number of odd number "+ odd_count);
				
				
				
		//		5. Find sum of digits in a number
				 
		//		   input ----1234 output----10	
				
				
//				int num= 12345,
//					
//					sum=0;
//				
//				while (num>0) {
//					
//				sum = sum + num% 10;
//				num = num/10;
//					
//				}
//				
//				System.out.println("sum of number is "+ sum);
				

	}
	

}
