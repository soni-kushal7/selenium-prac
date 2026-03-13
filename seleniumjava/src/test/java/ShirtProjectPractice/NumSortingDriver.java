package ShirtProjectPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NumSortingDriver {

	
	public static void main(String[] args) {


		List<Integer> num = new ArrayList<Integer>();
		 
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		
		System.out.println("Before Sorting :- ");
		
		for(int number :num) {
			
			System.out.println(number);
		
		}
		
		
		
		 num.sort(Comparator.comparingInt(n -> n));
		 
		 
		 System.out.println("After Sorting :- ");
		 
		 for(int number :num) {
				
				System.out.println(number);
			
			}
		
		
	}

}
