package JavaCoding;

public class ReverseString {

	public static void main(String[] args) {
		
		
	String OrignalStr= "Kushal";
	
	String revString = "";
		
		
		
//		 for (int i = str.length() - 1; i >= 0; i--) {
//	            rev = rev + str.charAt(i);
//	        }
//		
//		System.out.println(str);
//		System.out.println(rev);
		
		
		
//		for (int i=OrignalStr.length() -1; i>=0; i-- ) {
//			
//			revString= revString + OrignalStr.charAt(i);
//			
//			
//		}
//		
//		System.out.println("Orignal String is : "+ OrignalStr);
//		System.out.println("Reverse String is : "+ revString);
//		
//
//	}
		
		
		
//		String str = "kushal verma";
//		
//		String rev = "";
//		
//		for (int i=str.length()- 1;i >=0 ; i--) {
//			
//			
//			rev=rev+ str.charAt(i);
//		
//		
//		}
//		
//		System.out.println("Origenal String is : " + str);
//		
//		System.out.println("Reverse String is : " + rev);
	
		
		
		String originalStr = "Learn Java Programing";
        String[] words = originalStr.split(" ");
        String revSentence = "";

        for (String word : words) {

            String revWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                revWord = revWord + word.charAt(i);
            }

            revSentence = revSentence + revWord + " ";
        }

        System.out.println("Original String : " + originalStr);
        System.out.println("Reversed String : " + revSentence.trim());
		
		
        
        
        
        
		
		
	}
		
		

}
