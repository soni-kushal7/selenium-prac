package Encapsulation;

public class Employee {
	
	
	private String name;
	private int eid;
	
	
	
	public void setName(String name) {
		
		this.name=name;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	 
	public void setEid(int eid) {
		
		if(eid >0) {
			
			this.eid=eid;
		}
		
		else {
			
			System.out.println("Invalid Id....");
		}	
		
	}
	
	
	public int getEid() {
		
		return eid;
		
	}
		

}
