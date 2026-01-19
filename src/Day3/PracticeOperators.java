package Day3;

import javax.annotation.processing.SupportedSourceVersion;

public class PracticeOperators {

	public static void main(String[] args) {
		
		// Swapping a number----->
		
		
		int a= 10;
		int b=20;
	     
		System.out.println("Number before swapping : a = " + a + ", b = "+b);
		
		a=a+b;   //30
		b=a-b; 
		a=a-b;
		
		System.out.println("Number after swap : a = "+ a+ ", b = "+b );
		
		
		
		
		
//----------------------------------------------------------------------
		
		
		
		int x=100;
		int y=200;
		
		System.out.println("Number before swap : x ="+ x + ", y = "+y);
		
		x=x+y; //300
		y=x-y; //100
		x=x-y; //200
		
		System.out.println("Number After swap : x ="+ x + ", y = "+y);
		
		
//----------------------------------------------------------------------
		
		
		int c=10; 
		int d=20;
		
		int temp = c;
		
		System.out.println("Number before swap : c ="+ c + ", d = "+d);
		
		c=d;
		d=temp;
		System.out.println("Number After swap : c ="+ c + ", d = "+d);
		
		
		
//---------------------------------------------------------------------
		
		
		String s="kushal";
		String v="Verma";
		
		System.out.println("String before swap : s ="+ s + ", v = "+v);
		String tem = "Kushal";
		s=v;
		v=tem;
		
		System.out.println("String After swap : s ="+ s + ", v = "+v);
		

		
//----------------------------------------------------------------------------------------		
		int r=40;
		int t=50;
		System.out.println("String before swap : r ="+ r + ", t = "+t);
		
		r=r+t; //90
		t=r-t; // 40
		r=r-t; // 50
		
		System.out.println("String After swap : r ="+ r + ", t = "+t);
		
//-----------------------------------------------------------------------------------------
		
		
		int l=10;
		int m=20;
		
		System.out.println("Number before swap l = "+l+ ", m= "+m );
		
		l=m+l;//30;
		m=l-m;//10
		l=l-m;//20
		
		System.out.println("Number After swap l = "+l+ ", m= "+m );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
