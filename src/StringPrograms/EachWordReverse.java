package StringPrograms;

import java.util.Scanner;

public class EachWordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String oldstr = sc.nextLine();
		oldstr = oldstr.toLowerCase();
		String[] ar=oldstr.split("\\s+");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		String[] newarr=new String[ar.length];
		String newstr="";
		for(int i=0;i<ar.length;i++) {
			StringBuilder str = new StringBuilder(ar[i]);
			newarr[i]=str.reverse().toString();
		}
		for(int i=0;i<ar.length;i++) {
			newstr=newstr+newarr[i]+" ";
		}
		System.out.println(newstr.trim());
	}

}