package JavaCoding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		
		
		
		int[] a1= {12, 10, 23, 12, 45, 23, 10, 17, 23, 40, 12};
		HashSet<Integer> s1=new HashSet<>();
		for(int x:a1) {
			s1.add(x);
		}
		System.out.println("Duplicates removed: "+s1);
		
		System.out.println("=================================================================");
	
		
		 int[] a = {12, 10, 23, 12, 45, 23, 10, 17, 23, 40, 12};

	        HashMap<Integer, Integer> countMap = new HashMap<>();

	        // Count each number
	        for (int num : a) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }

	        System.out.println("Element Frequency:");
	        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
	            System.out.println(entry.getKey() + " → " + entry.getValue());
	        }

	        System.out.println("\nDuplicates are:");
	        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " (count: " + entry.getValue() + ")");
	            }
	        }

	}
}


