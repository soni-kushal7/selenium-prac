package Day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		
		
		//Mutable ----- can change
		
		int a[]= {10,30,50,20,40};
		System.out.println("Before sort : "+ Arrays.toString(a));
		
		Arrays.sort(a); // Mutable
		
		System.out.println("After sort : "+ Arrays.toString(a)); 
		
//Output------Before sort : [10, 30, 50, 20, 40]  |||||  After sort : [10, 20, 30, 40, 50]	
		
		
		//Immutable ----- can not change
		
		String s = new String ("welcome");
		
		System.out.println("Before change :" + s);
		
		s.concat("to java");
		
		System.out.println("After change :" + s);
		
		
//Output------Before change :welcome  |||||     After change :welcome		
	

		
//Note:- If any method/opration can changing the orignal values of the variable is called mutable feature.
//       If any method/opration is not able to change the orignal values of the variable is called immutable feature.		
		
		
		
		
	}

}
