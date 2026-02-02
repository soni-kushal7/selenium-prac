package ShirtProject;

public class ShirtDriver {

	public static void main(String[] args) {

		  ShirtService service = new ShirtService();

	        // Add Shirts
	        service.addShirt("Polo", 2700.25, "Blue", 34);
	        service.addShirt("VanH", 2200.75, "White", 32);
	        service.addShirt("LouisP", 2700.25, "Black", 36);
	        service.addShirt("ParkA", 2400.0, "Grey", 34);
	        service.addShirt("AllenS", 2600.5, "Green", 38);
	        service.addShirt("Raymond", 2100.0, "Yellow", 32);

	        // Access & Display
	        service.displayAllShirts();
	        service.displayByBrand("Polo");
	        service.displayByBrandAndSize("VanH", 32);
	        service.displayByPriceRange(2000, 2500);
	        service.displayBySizeAndPrice(34, 2300, 2800);

	        // Sort Examples
	        service.sortBySizeAsc();
	        service.sortBySizeDesc();
	        service.sortByPriceAsc();
	        service.sortByPriceDesc();
	        service.sortByBrandAsc();
	    }

}


