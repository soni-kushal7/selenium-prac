//package Day14;
//
///*
//
////1.single Inheritance---->There is only 1 parent class and 1 child class 
//
//class a                        // parent class
//{
//	int a=100;
//	
//	void display()
//	{
//		System.out.println(a);
//		
//	}
//	
//}
//
//
//class b   extends a                      // Child class
//{
//	int b=200;
//	
//	void show() 
//	{
//		System.out.println(b);
//		
//	}
//	
//}
//
//*/
//
//
////2.multi-level Inheritance---->1 parent class can have another child class and another child class can have another child class and so on.
//
//
//class a                        // parent class
//{
//	int a;
//	
//	void display()
//	{
//		System.out.println(a);       //there are 1 variables and 1 methods in class a
//		
//	}
//	
//}
//
//
//class b   extends a                      // Child class
//{
//	int b;
//	void show()                      //Now there are 2 variables and 2 methods in class b 
//	{
//		System.out.println(b);
//		
//	}
//	
//}
//
//
//class c extends b      //Now there are 3 variables and 3 methods in class c
//{
// int c;
// 
// void print() 
// {
//	 System.out.println(c);
//	 
// }
//
//
//}
//
//
//
//
//
//
//
//
//
//public class InheritanceTypes {
//
//	public static void main(String[] args) {
//		
///*
//		//1.single Inheritance---->There is only 1 parent class and 1 child class 
//				
//		b bobj= new b();
//		System.out.println(bobj.a);
//		System.out.println(bobj.b);
//		bobj.display();
//		bobj.show();
//*/
//
//		
//		
//		
//
////2.multi-level Inheritance---->1 parent class can have another child class and another child class can have another child class and so on.
//		
//		
//		
//	c cobj = new c();
//	
//	cobj.a=100;
//	cobj.b=200;
//	cobj.c=300;
//	
//	cobj.display();
//	cobj.show();
//	cobj.print();
//		
//		
//		
//		
//
//	}
//
//}
//
//
//
//
//
//

package Day14;

public class InheritanceTypes {

	public static void main(String[] args) {
		
		String str1 = "abcxyz";
        String str2 = "def";
        StringBuilder finalStr = new StringBuilder();

        int length = str1.length()+ str2.length();

        for (int i = 0; i < length; i++) {
            if (i < str1.length()) {
                finalStr.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                finalStr.append(str2.charAt(i));
            }
        }

        System.out.println("Final String: " + finalStr.toString()); 

	}

}
