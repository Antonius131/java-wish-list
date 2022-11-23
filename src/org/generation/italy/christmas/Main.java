package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		List<String> wish = new ArrayList<>();
		boolean yOn = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (yOn) {
			
			System.out.println("Aggiungi un prodotto alla tua wishlist: ");
			String prd = sc.next();
			
			wish.add(prd);
			
			System.out.println("La tua wishlist è composta da " + wish.size() + " elementi");
			System.out.println("Vuoi aggiungere un altro elemento?");
			String choice = sc.next();
			
			if (choice.equals("sì")) {
				
				yOn = true;
			} else {
				
				yOn = false;
				break;
			}
		}
		sc.close();
		
		wish.sort(null);
		System.out.println("La tua wishlist è composta da:");
		System.out.println(wish);
	}
}
