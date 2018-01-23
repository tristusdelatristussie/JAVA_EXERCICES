import java.util.Scanner;

public class Exercice1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ex #1  (2 manières différents à faire) : 
			1.	Lire une valeur (entier) 
			2.	Afficher des messages différents : 
			a.	Si la valeur est supérieur de zéro : « Numéro positif »
			b.	Si la valeur est égal de zéro : « Zéro»
			c.	Si la valeur est inferieur de zéro : « Numéro négatif »
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez une valeur entiere");
		int s = sc.nextInt();

		if( s > 0) {
			System.out.println("La valeur est superieur a zero");
		}else if( s < 0) {
			System.out.println("La valeur est inf a zero");
		}else {
			System.out.println("La valeur est egale a zero");
		}
		
		
		
		
	}

}
