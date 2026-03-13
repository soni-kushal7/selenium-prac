package JavaProgramPractice;

import java.util.HashMap;

public class Practice1 {

	public static void main(String[] args) {

      String input = "banana";
      
      HashMap<Character, Integer > map = new HashMap<>();
      
      for(int i=0; i<input.length();i++) {
    	  
    	  char ch =input.charAt(i);
    	  
    	  if(map.containsKey(ch)) {
    		  
    		  map.put(ch, map.get(ch)+1);
    		  
    	  }else {
    		  
    		  map.put(ch, 1);
    	  }
    		 
    	  
      }
      System.out.println(map);
		
		
		
		

	}

}
