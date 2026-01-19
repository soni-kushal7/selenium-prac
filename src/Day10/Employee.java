package Day10;

public class Employee {
	
	
//Creating variables
	
	int eid;
	String ename;
	String job;
	int sal;

// Creating Method
	
	void display()  // void means no return value and empty () means there in no parameter	
	{
//		System.out.println(eid);
//		System.out.println(ename);
//		System.out.println(job);
//		System.out.println(sal);
		System.out.println("Employee data:-  "+ eid+ " "+ename+ " " +job+ " "+sal );
		
	}
	
	
// Note-->^ Inside the main method we should not specify the method.a method does not have any other method	
	   // ^ Object should be created with in the main main method 
	
//Below is a main method	
	
/*

	public static void main(String[] args) 
	{
		
		Employee emp1= new Employee();  // emp1 is an object
		emp1.eid=101;                  // Assign the data to the variable
		emp1.ename="Kushal Verma";
		emp1.job="QA";
		emp1.sal=150000;
		emp1.display();   // To print the data 
		
//		System.out.println("Employee data:-  "+ emp1.eid+ " "+emp1.ename+ " " +emp1.job+ " "+emp1.sal );
//		      //If we do not have display method----this is not required 
		
		
		Employee emp2= new Employee(); 
		emp1.eid=102;                  // Assign the data to the variable
		emp1.ename="Rajat";
		emp1.job="QA";
		emp1.sal=100000;
		emp1.display();   // To print the data 
		
//		System.out.println("Employee data:-  "+ emp1.eid+ " "+emp1.ename+ " " +emp1.job+ " "+emp1.sal );
//	      //If we do not have display method-----this is not required
		
		

	}
*/
}

