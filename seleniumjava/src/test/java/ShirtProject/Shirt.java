package ShirtProject;

public class Shirt {

	 String brand;
	    double price;
	    String color;
	    int size;

	    // Constructor
	    public Shirt(String brand, double price, String color, int size) {
	        this.brand = brand;
	        this.price = price;
	        this.color = color;
	        this.size = size;
	    }

	    // toString() – for easy printing
	    public String toString() {
	        return "Brand: " + brand + ", Price: " + price + ", Color: " + color + ", Size: " + size;
	    }

	
}
