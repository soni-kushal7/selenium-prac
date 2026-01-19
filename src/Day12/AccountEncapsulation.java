package Day12;

public class AccountEncapsulation {
	

	
// First we have to create private variables.	
	
	private int accno;
	private String name;
	private double amount;
	
	// Now we have to create 2 methods (get & set) for every variables.
	
	
	/*	
		
		void setAccno(int accno)
		{
			//accno=acno;
			this.accno=accno;   //here "this"  keyword representing  the class variable  
		}
		
		int getAccno() 
		{
			return accno;
			
		}
		
		get and set is used to because we make the variables as private means we can not directly 
		access the variables through onbject
	*/	
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	



	
	
}
