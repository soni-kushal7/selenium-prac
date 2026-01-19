package Day11;

public class GreetingsMain {

	public static void main(String[] args) {
		
		
		Greetings gre = new Greetings();
		
	    gre.m1();                  //	1. No parameter     No return Value 
	                               // and it is not returning any value we, no need to maintain any variable here.

	    
	    
	    String s=gre.m2();             //  2. No parameter     return Value 
	    System.out.println(s);         // it is returning some value so need to hold it in a variable,
	                                   //and type of the variable is string

	    
	    
	    Greetings num1=new Greetings();  //  2. No parameter     return Value 
	    int s1= num1.m3();               // it is returning some value so need to hold it in a variable,
                                         //and type of the variable is int
	    System.out.println(s1);
	    
	    
	    gre.m4(" Kushal Soni");         // 3.Takes parameter	No return Value 
	                                   	// and it is not returning any value we, no need to maintain any variable here.
	    
	    
	    String s2=gre.m5("Kushal??");    //4.Takes parameter   return Value 
        System.out.println(s2);          // it is returning some value so need to hold it in a variable,
                                         //and type of the variable is string
	}

}
