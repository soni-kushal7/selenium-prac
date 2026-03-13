package JavaCoding;

public class ReverseWholeString {

	public static void main(String[] args) {
		
		
		//string: I am Kushal Verma
		//output: Verma Kushal am i
				
//				String str="I am Kushal Verma";
//				String newstr="";
//				String[] ar=str.split("\\s+");
//				for(int i=ar.length-1;i>=0;i--) {
//					newstr=newstr+ar[i]+" ";
//				}
//				
//				System.out.println(newstr.trim());
		
		
		//string: I am Kushal Verma
				//output: Verma Kushal am i
		
		
		String str = "My Name Is Kushal";
		
		String newStr = "";
		
		String[] ar = str.split("\\s+");
		
		for (int i=ar.length-1; i>=0; i--) {
			
			newStr= newStr + ar[i]+ " ";
			
		}
		
		System.out.println(newStr.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
