package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] favFoods = {"Pasta", "Pizza", "Sushi", "Vino", "Kebab"};
		
		System.out.println("Food List:");
		for (int i = 0; i < favFoods.length; i++) {
			System.out.println(i + 1 + "- " + favFoods[i]);
		}
		
		System.out.print("\n");
		
		int lenList = favFoods.length;
		int mediumId = 0;
		if (lenList % 2 == 0) mediumId = (lenList / 2) - 1 ;
		else mediumId = lenList / 2;
		
		System.out.println("Total number: " + lenList);
		System.out.println("Favourite Food: " + favFoods[0]);
		System.out.println("Medium favourite Food: " + favFoods[mediumId]);		
		System.out.println("Least favourite Food: " + favFoods[favFoods.length - 1]);
	}
}
