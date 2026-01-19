package Day10;

// import packagename(Day2).classname; 
//if employee class is present in some other package,ex-day1

public class EmployeeMain {

	public static void main(String[] args) {
	
		
		
		Employee emp1= new Employee();  // emp1 is an object
		emp1.eid=101;                  // Assign the data to the variable
		emp1.ename="Kushal Verma";
		emp1.job="QA";
		emp1.sal=150000;
		emp1.display();   // To print the data 
		
		
		Employee emp2= new Employee(); 
		emp1.eid=102;                  // Assign the data to the variable
		emp1.ename="Rajat";
		emp1.job="QA";
		emp1.sal=100000;
		emp1.display();   // To print the data 
		
		
		

	}

}
