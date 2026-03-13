package JavaProgramPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {


		String input = "banana";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i=0; i<input.length();i++) {
			
			set.add(input.charAt(i));
			
		}
		
		for(char ch:set) {
			
			System.out.print(ch);
			
		}
		

	}

}
