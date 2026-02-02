package ShirtProjectPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShirtDriver {

	public static void main(String[] args) {
		
		
		List<Shirt> shirts = new ArrayList<>();
		
		
		shirts.add(new Shirt("Polo  ", "Blue", 2700.25, 34));
		shirts.add(new Shirt("VanH ", "White", 2200.75, 32));
		shirts.add(new Shirt("LouisP", "Black", 2700.25, 36));
		shirts.add(new Shirt("ParkA", "Grey", 2400.0, 34));
		shirts.add(new Shirt("AllenS", "Green", 2600.5, 38));
		shirts.add(new Shirt("Raymond", "Yellow", 2250.0, 32));
		
		System.out.println("All shirts are :- ");
		
		for(Shirt s:shirts) {
			
			System.out.println(s);
		}
		
		
		//shirts.sort((sh1,sh2)-> sh1.size-sh2.size);
		
		shirts.sort(
				
				Comparator
				
				.comparingInt((Shirt sh)->sh.size)
				.thenComparingDouble(sh->sh.price).reversed()
				
				);
		
		
		//shirts.sort(Comparator.comparingDouble((Shirt sh)->sh.price));
		
		System.out.println("All Sorted shirts are by Size --> then price: ");
		for(Shirt s:shirts) {
			System.out.println(s);
		}
		
		
	}

}
