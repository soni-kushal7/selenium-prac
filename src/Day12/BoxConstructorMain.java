package Day12;

public class BoxConstructorMain {

	public static void main(String[] args) {
		
//First we have to create object of the class and at the time of creation,constructor is invoked.
		
		//BoxConstructor b = new BoxConstructor();                 // 1 --> is invoked.
		//BoxConstructor b = new BoxConstructor(25.5,21.2,24.5);  // 2 --> is invoked.
		BoxConstructor b = new BoxConstructor(10.1);              // 3 --> is invoked.
		
		System.out.println(b.volume());       
		
		

	}

}
