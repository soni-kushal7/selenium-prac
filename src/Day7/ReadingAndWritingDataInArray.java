package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataInArray {

	public static void main(String[] args) {
		
//Reading data into array by using scanner class		
		int a[]= new int[5];
		
		Scanner sc= new Scanner(System.in);
		
		 
		for (int i=0; i< a.length;i++) {
			
			System.out.println("Enter the value for the position "+ i + ":");
			a[i]= sc.nextInt(); 
		}
		
		System.out.println("Printing array element.......");
		System.out.println(Arrays.toString(a));
		
		
		

	}

}
