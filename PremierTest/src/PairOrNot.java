import java.util.Scanner;

public class PairOrNot {
	
	/*
	 * 5. Write a Java program that returns even(pair) or not even number for a given number

	 */
	
	static Scanner s = new Scanner(System.in);
	static int num;
	int a;
	int b;
	int p;
	
	static void pair() {
		System.out.println("Entrez un nbre: ");
		num = s.nextInt();

		if(num%2 == 0) {
			System.out.println("C est un nbre pair");
			
		}else {
			System.out.println("Ce n est pas un nbre pair");
		}
		
		System.out.println("voulez vous continuer ? ");
		String cont = s.next();
		if(cont.contains("oui")) {
			pair();
		}else {
			System.out.println("Au revoir");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pair();

	}

}
