package Day6;

public class Single_dimension_array {

	public static void main(String[] args) {
		
		
		/*
		
		Array----An array is a collection of multiple values stored in a single variable 
		         instead of declaring separate variables for each value. 
		         It allows us to store and access multiple elements of the same data type in a structured way.
		
		
		int a = 10;
		
		Syntax-->
		
		int a[] = new int [5];
		
-------------------------------------------------------		
		
		Types of array-->
		
		1.single dimension array
		2.two dimension/ multi-dimension array.
		
		
		
	1.Single dimension array	
	
 --------------------------------------
1.Declare an array
2.add value into array
3.find length on an array
4.read single value from an array
5.read multiple values from an array.		
		
				
		
*/		
		
	// 	Declare an array
		
	//Approach 1
		
//		int a[]= new int [5];      // Declare an array	    (int []a= new int [5];)
//	
//		a[0] = 100;
//		a[1] = 200;
//		a[2] = 300;        //add value into array or initilise value in array
//		a[3] = 400;      // if we know how much data we have to store in an array then we go with 1st approach,
//		a[4] = 500;       // size is fixed
		
		
		
		
	// Approach 2
		
		//int b[] = {100,200,300,400,500};   
		                                      // If we dint know how much data we have to store in an array then 
		                                       //we go with 2st approach. it is more dynamic in nature.
		
		                                     
	//find length on an array
		
		//System.out.println(b.length);
		
		
	//	read single value from an array	
		
		//System.out.println(b[4]);
		
		//System.out.println(b[5]); // it will throw an error,"Index 5 out of bounds for length 5"
		
		
		
	//read multiple values from an array.	
		
	/*
		// By normal for loop
		
		int b[] = {100,200,300,400,500}; 
		
		
		for(int i=0 ; i< b.length; i++) {
			
			System.out.println(b[i]);
		}
		
		
		*/
		
		//Enhanced for loop or for each loop
		
		int c[]= {100,200,300,400,500};
		
		for (int x :c ) {
			
			System.out.println(x);
		}
		
		

	}

}
