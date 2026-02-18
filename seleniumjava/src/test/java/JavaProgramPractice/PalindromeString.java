package JavaProgramPractice;

public class PalindromeString {

	public static void main(String[] args) {


		String input = "kushal";
		
		String rev = "";
		
		for (int i=input.length()-1; i>=0; i--) {
			
		rev =rev + input.charAt(i);
			
		}
		
		if(input.equals(rev)) {
			
			System.out.println("Its a Palindrome String");
		}else {
			
			System.out.println("Its not a Palindrome String");
		}
		

	}

}
