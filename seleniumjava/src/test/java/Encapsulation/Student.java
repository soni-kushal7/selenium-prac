package Encapsulation;

 public class Student {
	
	
	private String name;
	private int age;
	
	
	
	public void setName(String name) {
		
		this.name=name;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	
	public void setAge(int age) {
		
		if (age >0) {
			
			this.age= age;
		}
		else {
			
			System.out.println("Age is invalid.....");
		}
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	

	
	
	
	

}
