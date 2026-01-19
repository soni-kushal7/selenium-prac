package Day12;

public class AdderMain {

	public static void main(String[] args) {
		
// first we have to create object of Adder class to access the data.
		
		Adder addobj = new Adder();
		
		addobj.sum();        //1
		addobj.sum(35, 75);  //2
		addobj.sum(23, 28.6); //3
		addobj.sum(33.9, 23); //4
		addobj.sum(23,25,62); //5
		//addobj.sum(29.3, 32.1, 23); In valid 

	}

}
