import java.util.Scanner;

public class Exercice1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ex #1  (2 mani�res diff�rents � faire) : 
			1.	Lire une valeur (entier) 
			2.	Afficher des messages diff�rents : 
			a.	Si la valeur est sup�rieur de z�ro : � Num�ro positif �
			b.	Si la valeur est �gal de z�ro : � Z�ro�
			c.	Si la valeur est inferieur de z�ro : � Num�ro n�gatif �
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
