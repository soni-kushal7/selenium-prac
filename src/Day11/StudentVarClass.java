package Day11;

public class StudentVarClass {
	
	int sid;                   //These variables are class variables and access from everywhere
	String sname;
	char grade;
	
//1. Approach--store data using object reference variable
	
	void printStudentData() 
	{
		System.out.println(sid+" "+sname+" "+grade);
		
	}
	
//2. Approach --using method we can store the data.
	
	
	//This method is only for storing data into the variables
	
	void setStudentData(int id,String name,char gr)  //these variables are locale variables and access within this method only.
	{
		sid=id;
		sname=name;     //Storing this data --(int id,String name,char gr) into 
		grade=gr;       // (int sid;String sname;char grade;) these variables
		
	}
	
	
	StudentVarClass(int id,String name,char gr)
	{
		sid=id;
		sname=name;     
		grade=gr; 
		
	}
	
	
	


}
