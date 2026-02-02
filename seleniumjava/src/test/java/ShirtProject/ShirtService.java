package ShirtProject;

import java.util.*;

public class ShirtService {

	List<Shirt> shirts = new ArrayList<>();

    // a. Method to add shirts
    public void addShirt(String brand, double price, String color, int size) {
        shirts.add(new Shirt(brand, price, color, size));
        System.out.println("✅ Shirt Added: " + brand);
    }

    // b. Access all shirts
    public void displayAllShirts() {
        if (shirts.isEmpty()) {
            System.out.println("No shirts available.");
            return;
        }
        System.out.println("👕 All Shirts:");
        shirts.forEach(System.out::println);
    }

    // c. Access all shirts by brand
    public void displayByBrand(String brand) {
        System.out.println("\n🔍 Shirts of Brand: " + brand);
        shirts.stream()
              .filter(s -> s.brand.equalsIgnoreCase(brand))
              .forEach(System.out::println);
    }

    // d. Access all shirts by brand and size
    public void displayByBrandAndSize(String brand, int size) {
        System.out.println("\n🔍 Shirts of Brand: " + brand + " & Size: " + size);
        shirts.stream()
              .filter(s -> s.brand.equalsIgnoreCase(brand) && s.size == size)
              .forEach(System.out::println);
    }

    // e. Access all shirts in a price range
    public void displayByPriceRange(double min, double max) {
        System.out.println("\n💰 Shirts in Price Range: " + min + " - " + max);
        shirts.stream()
              .filter(s -> s.price >= min && s.price <= max)
              .forEach(System.out::println);
    }

    // f. Access shirts by size and price range
    public void displayBySizeAndPrice(int size, double min, double max) {
        System.out.println("\n📏 Shirts of Size " + size + " and Price Range: " + min + " - " + max);
        shirts.stream()
              .filter(s -> s.size == size && s.price >= min && s.price <= max)
              .forEach(System.out::println);
    }

    // g. Sort shirts on size low → high
    public void sortBySizeAsc() {
        shirts.sort(Comparator.comparingInt(s -> s.size));
        System.out.println("\n⬆️ Shirts Sorted by Size (Low to High):");
        shirts.forEach(System.out::println);
    }

    // h. Sort shirts on size high → low
    public void sortBySizeDesc() {
        shirts.sort(Comparator.comparingInt((Shirt s) -> s.size).reversed());
        System.out.println("\n⬇️ Shirts Sorted by Size (High to Low):");
        shirts.forEach(System.out::println);
    }

    // i. Sort shirts on price low → high
    public void sortByPriceAsc() {
        shirts.sort(Comparator.comparingDouble(s -> s.price));
        System.out.println("\n💵 Shirts Sorted by Price (Low to High):");
        shirts.forEach(System.out::println);
    }

    // j. Sort shirts on price high → low
    public void sortByPriceDesc() {
        shirts.sort(Comparator.comparingDouble((Shirt s) -> s.price).reversed());
        System.out.println("\n💸 Shirts Sorted by Price (High to Low):");
        shirts.forEach(System.out::println);
    }

    // k. Sort shirts on brand alphabetically
    public void sortByBrandAsc() {
        shirts.sort(Comparator.comparing(s -> s.brand.toLowerCase()));
        System.out.println("\n🔤 Shirts Sorted by Brand (A–Z):");
        shirts.forEach(System.out::println);
    }
		
	
}
