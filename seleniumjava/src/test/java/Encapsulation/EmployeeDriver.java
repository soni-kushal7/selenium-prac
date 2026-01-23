package Encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		
		emp.setName("Ankit");
		emp.setEid(1920);
	
		System.out.println(emp.getName());
		System.out.println(emp.getEid());
		

	}

}
