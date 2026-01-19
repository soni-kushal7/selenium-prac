package JavaPrograms;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		Employee emp1= new Employee(); // emp1 is a object through which we access variable and method

		emp1.eid=101;
		emp1.ename="Kushal Soni";
		emp1.job="QA Automation Engineer";
		emp1.sal= 200000;

		emp1.display();
		

	}

}
