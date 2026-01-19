package Day7;

public class SearchingElementInArray {

	public static void main(String[] args) {
		
/*
 
 Q1- Search an element in an array	(linear search)
 Q2-Find number of repetation in an array.
 	
 	
 	
 	
 */
		
		
		
//Search an element in an array----(linear search)
		
		//Narmal for loop		
	/*	
		int a[] = {10,20,30,40,50};
		int search_element =30;
		boolean status = false;
		  
		
		for (int i=0;i< a.length ; i++) {
			
		if (a[i]==search_element) 
		{			
			System.out.println("Element Found");
			status=true;
			break;		
		}
					
		}
		   if (status==false) 
		   {			   
			   System.out.println("Element Not Found");
			   
		   }
		   
*/		   
		   
//Enhanced for loop		   
	
/*		
		int a[] = {10,20,30,40,50};
		int search_element =300;
		boolean status = false;
		  
		
		for (int x:a) {
			
		if (x==search_element) 
		{			
			System.out.println("Element Found");
			status=true;
			break;		
		}
					
		}
		   if (status==false) 
		   {			   
			   System.out.println("Element Not Found");
			   
		   }   
		   
	*/
		
		
//Find number of repetation in an array.
		
		//Simple for loop
		
//		int a[] = {10,20,10,30,10,40,20};
//		int num = 10;
//		
//		int count=0;
//		
//		for (int i=0;i< a.length;i++) {
//			
//			if (a[i]==num) {
//				
//				count++;
//			}
//			
//			
//		}
//		
//		System.out.println(count);
		
		
//Enhanced for loop		
		
//		int a[] = {10,20,10,30,40,10};
//		
//		int num= 10;
//		int count= 0; 
//		
//	for	( int value :a) {
//		
//		if (num==value) {
//			
//			count++;
//		}
//		
//	}
//	System.out.println(count);

		
		
		
		
		
		

		
		int a[] = {10,20,30,10,10,20,30,20};
  //   	int num=10;
		int count=0;
		
		for (int i=0;i<a.length ;i++) {
			
		for (int j=0;j<a.length ; j++) {
			
			
                if (a[i]== a[j]) {
				
				count++;
				
			}	
                
		}
		
		System.out.println(a[i]+" is repeating "+ count);
		count =0;
//		break;
		
			
				
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
