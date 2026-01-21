package Polymorphism;


//MethodOverriding example.....

	class Person{
		
		void role(){
			
			System.out.println("I am a person");
			
		}
		
	}		
		class Father extends Person{
			
			
			void role() {
				
				System.out.println("I am a father");
				
			}
			
			
		}
		
		
		class Brother extends Person{
			
			void role() {
				
				System.out.println("I am brother");
				
			}
			
			
		}
		

	public class MethodOverriding {
	public static void main(String[] args) {
		
	
		Person p = new Brother();
		p.role();
		
		

	}

}
