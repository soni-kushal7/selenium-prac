package Inheritance;

 class Animal {

	
	void sound() {
		
		System.out.println("Animal sound");
		
	}
	
}

class Dog extends Animal {
	
	void sound() {
		
		System.out.println("Dog bark");
		
	}
	
}


class Cat extends Animal {
	
	void sound() {
		
		System.out.println("Cat Meow");
		
	}
	
}




