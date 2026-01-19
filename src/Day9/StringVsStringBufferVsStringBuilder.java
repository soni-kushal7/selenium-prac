package Day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		/*
		 
		String --------immutable, can not change original value
		 
		String s= "welcome";
		s.concat("To java");
		System.out.println(s); //welcome  ||  immutable, can not change original value
		
		*/
		
	
/*		
		
	//StringBuffer----mutable
		
		StringBuffer s= new StringBuffer("welcome");
		
		s.append("to java"); //append is used as a concat 
		
		System.out.println(s); //welcome to java   || mutable----we can change original value of s
*/
		

/*		
-----------------------------------------------------------------------------------------------------------		
		//StringBuilder----mutable	
		
        StringBuilder s= new StringBuilder("welcome");
		
		s.append("to java"); //append is used as a concat 
		
		System.out.println(s); // welcome to java   || mutable----we can change original value of s
		
------------------------------------------------------------------------------------------------------------		
*/		
		
		
		
		
		
		

	}

}
