package newShirtProject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Service {

	
	List<Shirt> shirts= new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void load() {
		shirts.add(new Shirt("Arrow", "Red", 2200.00, 32));
		shirts.add(new Shirt("Polo  ", "Blue", 2800.00, 34));
		shirts.add(new Shirt("VanH ", "White", 2200.00, 30));
		shirts.add(new Shirt("Levis ", "Black", 2800.00, 36));
		shirts.add(new Shirt("Tommy ", "Green", 3000.00, 38));
		shirts.add(new Shirt("H&M   ", "Pink", 2200.00, 30));
		shirts.add(new Shirt("Zara  ", "Yellow", 3500.00, 40));
		shirts.add(new Shirt("Arrow", "Gray", 2000.00, 42));
		shirts.add(new Shirt("Gap   ", "Orange", 2200.00, 44));
		shirts.add(new Shirt("Arrow", "Purple", 2600.00, 46));
		shirts.add(new Shirt("Mango ", "Cyan", 2800.00, 30));
		shirts.add(new Shirt("Arrow", "Brown", 2200.00, 50));
		shirts.add(new Shirt("Arrow", "Teal", 2300.00, 52));
	}
	//save shirts
	public void saveShirt() {
		System.out.println("Enter Shirt Brand:");
		String brand = sc.nextLine();
		System.out.println("Enter Shirt Color:");
		String color = sc.nextLine();
		System.out.println("Enter Shirt Price:");
		double price = Double.parseDouble(sc.nextLine());
		System.out.println("Enter Shirt Size:");
		int size = Integer.parseInt(sc.nextLine());
		Shirt newShirt = new Shirt(brand, color, price, size);
		shirts.add(newShirt);
		System.out.println("Shirt added successfully: ");
	}
	
	
	//view all shirts
	public void viewAllShirts() {
		if(shirts.isEmpty()) {
			System.out.println("No shirts available.");
			return;
		}
		for(Shirt x: shirts) {
			System.out.println(x);
		}
		System.out.println("All shirts are viewd");
	}
	
	//access shirts by brand
	public void accessShirtsByBrand() {
		System.out.println("Enter the brand name to search:");
		String brand = sc.nextLine();
		int x=0;
		for (Shirt s : shirts) {
			if (s.brand.equalsIgnoreCase(brand)) {
				System.out.println(s);
				x=1;
			}
		}
		if(x==0) {
			System.out.println("No shirts found for the brand: " + brand);
		}
		else {
			System.out.println("All Shirts accessed successfully for brand: " + brand);
		}
	}
	public void accessShirtsByPriceRange() {
		System.out.println("Enter minimum price:");
		double minPrice = Double.parseDouble(sc.nextLine());
		System.out.println("Enter maximum price:");
		double maxPrice = Double.parseDouble(sc.nextLine());
		int x=0;
		for (Shirt s : shirts) {
			if (s.price >= minPrice && s.price <= maxPrice) {
				System.out.println(s);
				x=1;
			}
		}
		if(x==0) {
			System.out.println("No shirts found in the price range: " + minPrice + " to " + maxPrice);
		}
		else {
			System.out.println("All Shirts accessed successfully in the price range: " + minPrice + " to " + maxPrice);
		}
	}
	public void accessShirtsBySizeAndPriceRange() {
		System.out.println("Enter shirt size:");
		int size = Integer.parseInt(sc.nextLine());
		System.out.println("Enter minimum price:");
		double minPrice = Double.parseDouble(sc.nextLine());
		System.out.println("Enter maximum price:");
		double maxPrice = Double.parseDouble(sc.nextLine());
		boolean found = false;
		for (Shirt s : shirts) {
			if (s.size== size && s.price >= minPrice && s.price <= maxPrice) {
				System.out.println(s);
				found= true;
			}
		}
		if(found) {
			System.out.println("All shirts accessed successfully for size: " + size + " and price range: " + minPrice + " to " + maxPrice);
		}
		else {
			System.out.println("No shirts found for size: " + size + " and price range: " + minPrice + " to " + maxPrice);
		}
		
	}
	/*public void sortOnSizeLowToHigh() {
		shirts.sort(Comparator.comparingInt(s -> s.size));
		viewAllShirts();
		System.out.println("Shirts sorted by size from low to high successfully.");
		
	}*/
	public void sortOnSizeLowToHigh() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparingInt(s -> s.size));
		for(Shirt s : temp) {
			System.out.println(s);
		}
		System.out.println("Shirts sorted by size from low to high successfully.");
		
	}
	public void sortOnSizeHighToLow() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparingInt((Shirt s) -> s.size).reversed());
		for(Shirt s : temp) {
			System.out.println(s);
		}
		System.out.println("Shirts sorted by size from high to low successfully.");
		
	}
	
	public void sortOnBrandLowToHigh() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparing(s -> s.brand));
		for(Shirt s : temp) {
			System.out.println(s);
		}
		System.out.println("Shirts sorted by brand from low to high successfully.");
		
	}
	public void sortOnBrandHighToLow() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparing((Shirt s) -> s.brand).reversed());
		for(Shirt s : temp) {
			System.out.println(s);
		}
		System.out.println("Shirts sorted by brand from high to low successfully.");
		
	}
	public void sortOnPriceLowToHighThenOnSize() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparingDouble((Shirt s) -> s.price).thenComparingInt(s -> s.size));
		for(Shirt s : temp) {
			System.out.println(s);
		}
		System.out.println("Shirts sorted by price from low to high successfully.");
		
	}
	public void sortOnPriceLowToHighThenOnSizeThenOnBrand() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparingDouble((Shirt s) -> s.price).thenComparingInt(s -> s.size).thenComparing(s -> s.brand));
		for(Shirt s : temp) {
			System.out.println(s);
		}
		System.out.println("Shirts sorted by price from low to high successfully.");
		
	}
	public void listAllBrands() {
		HashSet<String> brands = new HashSet<>();
		for (Shirt s : shirts) {
			brands.add(s.brand);
		}
		System.out.println("All brands are: "+ brands);
	}
	public void listAllBrands1() {
		List<String> brands = new ArrayList<>();
		for (Shirt s : shirts) {
			if(!brands.contains(s.brand))
				brands.add(s.brand);
		}
		System.out.println("All brands are: "+ brands);
	}
	
	
	
	
	
}
