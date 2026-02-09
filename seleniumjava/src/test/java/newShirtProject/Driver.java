package newShirtProject;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Shirt Project");
		Service service = new Service();
		service.load(); // Load initial shirts data
		String continueChoice;
		do {
			System.out.println("Press 1==> Add Shirt");
			System.out.println("Press 2==> view All Shirts");
			System.out.println("Press 3==> To Access all shirts on brand");
			System.out.println("Press 5==> To access shirts on price range");
			System.out.println("Press 6==> To access shirts on size and price range");
			System.out.println("Press 7==> To Sort on size Low To High");
			System.out.println("Press 8==> To Sort on size High To Low");
			System.out.println("Press 11==> To Sort on brand Low To High");
			System.out.println("Press 12==> To Sort on brand High To Low");
			System.out.println("Press 13==> To Sort on price Low To High and if price is same then sort on size low to high");
			System.out.println("Press 17==> To List all brands");
			System.out.println("Press 0==> Exit");
			//other options
			int choice=Integer.parseInt(sc.nextLine()) ;
			switch(choice) {
				case 1: 
					service.saveShirt();
					break;
				case 2:
					service.viewAllShirts();
					break;	
				case 3:
					service.accessShirtsByBrand();
					break;
				case 5:
					service.accessShirtsByPriceRange();
					break;
				case 6:
					service.accessShirtsBySizeAndPriceRange();
					break;
				case 7:
					service.sortOnSizeLowToHigh();
					break;	
				case 8:
					service.sortOnSizeHighToLow();
					break;
				case 11:
					service.sortOnBrandLowToHigh();
					break;
				case 12:
					service.sortOnBrandHighToLow();
					break;
				case 13:
					service.sortOnPriceLowToHighThenOnSize();;
					break;
				case 17:
					service.listAllBrands1();
					break;
				case 0:
					System.out.println("Thank you for using Shirt Project! Application Exiting...");
					System.exit(0);
				default:
					System.out.println("Invalid choice, please try again");
			}
			System.out.println("Do you want to continue? (yes/no)");
			continueChoice = sc.nextLine();
		}while(continueChoice.equalsIgnoreCase("yes"));
		System.out.println("======Thank You Application Ends!!======");	
	}


}







/*
 * List<Shirt> shirts=new ArrayList<>();
		Shirt s1=new Shirt("Arrow", "Red", 2200.75, 32);
		shirts.add(s1);
		shirts.add(new Shirt("Polo  ", "Blue", 2700.25, 34));
		shirts.add(new Shirt("VanH ", "White", 2200.75, 32));
		shirts.add(new Shirt("LouisP", "Black", 2700.25, 36));
		shirts.add(new Shirt("ParkA", "Grey", 2400.0, 34));
		shirts.add(new Shirt("AllenS", "Green", 2600.5, 38));
		shirts.add(new Shirt("Raymond", "Yellow", 2100.0, 32));
		System.out.println("All shirts are: ");
		for(Shirt s:shirts) {
			System.out.println(s);
		}
		//shirts.sort((sh1, sh2)->sh1.size - sh2.size);
		//shirts.sort((sh1, sh2)->sh1.price>sh2.price?1:(sh1.price<sh2.price?-1:0));
		shirts.sort(Comparator.comparingInt((Shirt sh)->sh.size).thenComparingDouble(sh->sh.price).thenComparing(sh->sh.brand));                   
		System.out.println("All Sorted shirts are: ");
		for(Shirt s:shirts) {
			System.out.println(s);
		}
 * 
 */




