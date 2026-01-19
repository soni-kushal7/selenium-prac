package Day12;

public class AccountEncapsulationMain {

	public static void main(String[] args) {
		
		AccountEncapsulation acc= new AccountEncapsulation();
		
		//acc.setAccno(872426);
		//System.out.println(acc.getAccno());
		
		
		acc.setAccno(1010002134);
		acc.setName("Kushal Soni");
		acc.setAmount(200000);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
		
		

	}

}
