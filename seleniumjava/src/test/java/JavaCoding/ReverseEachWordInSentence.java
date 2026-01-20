package JavaCoding;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {
		

		 String str = "I am Kushal Verma";
	        String[] words = str.split(" ");  // split the sentence into words
	        String result = "";

	        // Outer loop → each word
	        for (String word : words) {
	            String reversedWord = "";

	            // Inner loop → reverse the characters
	            for (int i = word.length() - 1; i >= 0; i--) {
	                reversedWord = reversedWord + word.charAt(i);
	            }

	            result = result + reversedWord + " ";
	        }

	        System.out.println(result.trim());
		
		
	
	        
	        
	        
	        
	        
	        
		
		
		
	}

}
