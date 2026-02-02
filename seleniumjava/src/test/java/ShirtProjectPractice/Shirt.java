package ShirtProjectPractice;

public class Shirt {

	
	String brand,color;
	double price;
	int size;
	
	Shirt(){
		
		
	}
	
	Shirt(String brand, String color, double price, int size){
		
		this.brand= brand;
		this.color=color;
		this.price=price;
		this.size=size;
			
	}
	
//	@override toString method--controls how the object prints in System.out.println()
	
	public String toString(){
		return "Shirt [brand=" + brand + "\tcolor=" + color + "\tprice=" + price + "\tsize=" + size + "]";
			
	}
	
	
	
}
