package Day11;

public class StudentMainVarClass {

	public static void main(String[] args) {
		
		
		
/*		
         StudentVarClass stu=new StudentVarClass();
		
		//1. Approach--store data using object reference variable
		
		stu.sid=101;
		stu.sname="akash";
		stu.grade='A';
		stu.printStudentData();   //In this approach we directly accessing the variables through 
		                          //the object and storing the data into the variables.
		
		
		
		//2. Approach --using method we can store the data.
		
		stu.setStudentData(102, "Ashish", 'A');
		stu.printStudentData();
		
*/		
		
		
		//3. Approach --using constructor to store data in a variable.
		
		StudentVarClass stu1=new StudentVarClass(105,"Kushal",'A');
		stu1.printStudentData();
		

	}

}
